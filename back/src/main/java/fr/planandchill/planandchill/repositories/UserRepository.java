package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}