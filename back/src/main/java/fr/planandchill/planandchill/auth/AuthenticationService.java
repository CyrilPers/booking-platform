package fr.planandchill.planandchill.auth;

import fr.planandchill.planandchill.email.EmailService;
import fr.planandchill.planandchill.email.EmailTemplateName;
import fr.planandchill.planandchill.user.Token;
import fr.planandchill.planandchill.user.TokenRepository;
import fr.planandchill.planandchill.user.User;
import fr.planandchill.planandchill.user.UserRepository;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.time.LocalDateTime;

@Service
public class AuthenticationService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;
    private final EmailService emailService;

    private String activationUrl;

    public AuthenticationService(PasswordEncoder passwordEncoder, UserRepository userRepository, TokenRepository tokenRepository, EmailService emailService, @Value("${mailing.activation.url}") String activationUrl) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
        this.emailService = emailService;
        this.activationUrl = activationUrl;
    }

    public void register(RegistrationRequest request) throws MessagingException {
        var user = new User(request.getFirstName(), request.getLastName(), false, false, request.getEmail(),passwordEncoder.encode(request.getPassword()), request.getPhoneNumber());
        userRepository.save(user);
        sendValidationEmail(user);
    }

    private void sendValidationEmail(User user) throws MessagingException {
        var newToken = generateAndSaveActivation(user);
        emailService.sendEmail(
                user.getEmail(),
                user.fullName(),
                EmailTemplateName.ACTIVATE_ACCOUNT,
                activationUrl,
                newToken,
                "Account_activation"
        );

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
