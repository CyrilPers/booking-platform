package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}