package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Planning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanningRepository extends JpaRepository<Planning, Integer> {
}