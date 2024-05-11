package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}