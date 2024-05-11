package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {
}