package fr.planandchill.planandchill.auth;

import fr.planandchill.planandchill.email.EmailService;
import fr.planandchill.planandchill.entities.Customer;
import fr.planandchill.planandchill.user.Token;
import fr.planandchill.planandchill.user.TokenRepository;
import fr.planandchill.planandchill.user.User;
import fr.planandchill.planandchill.user.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class AuthenticationService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;
    private final EmailService emailServicec;

    public AuthenticationService(PasswordEncoder passwordEncoder, UserRepository userRepository, TokenRepository tokenRepository, EmailService emailServicec) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
        this.emailServicec = emailServicec;
    }

    public void register(RegistrationRequest request) {
        var user = new User(request.getFirstName(), request.getLastName(), false, false, request.getEmail(),passwordEncoder.encode(request.getPassword()), request.getPhoneNumber());
        userRepository.save(user);
        sendValidationEmail(user);
    }

    private void sendValidationEmail(User user) {
        var newToken = generateAndSaveActivation(user);
        // send email

    }

    private String generateAndSaveActivation(User user) {
        // generate Token
        String generatedToken = generateActivationCode(6);
        var token = new Token(
                generatedToken,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(15),
                user);
        tokenRepository.save(token);
        return null;
    }

    private String generateActivationCode(int length) {
        String characters = "0123456789";
        StringBuilder codeBuilder = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < length; i++) {
            int randomIndex = secureRandom.nextInt(characters.length());
            codeBuilder.append(characters.charAt(randomIndex));
        }
        return codeBuilder.toString();
    }
}
