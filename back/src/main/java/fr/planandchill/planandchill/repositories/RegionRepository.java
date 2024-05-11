package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, String> {
}