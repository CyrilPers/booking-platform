package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.PermissionsLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionsLevelRepository extends JpaRepository<PermissionsLevel, Integer> {
}