package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.PostalCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostalCodeRepository extends JpaRepository<PostalCode, String> {
}