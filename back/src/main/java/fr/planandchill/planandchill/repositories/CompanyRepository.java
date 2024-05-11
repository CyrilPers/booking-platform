package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {
}