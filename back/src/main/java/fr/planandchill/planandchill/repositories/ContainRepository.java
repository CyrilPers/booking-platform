package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Contain;
import fr.planandchill.planandchill.entities.ContainId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContainRepository extends JpaRepository<Contain, ContainId> {
}