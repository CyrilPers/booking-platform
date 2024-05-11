package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}