package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Subscribe;
import fr.planandchill.planandchill.entities.SubscribeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscribeRepository extends JpaRepository<Subscribe, SubscribeId> {
}