package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.AppointmentState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentStateRepository extends JpaRepository<AppointmentState, Integer> {
}