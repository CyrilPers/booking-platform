package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.County;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountyRepository extends JpaRepository<County, Integer> {
}