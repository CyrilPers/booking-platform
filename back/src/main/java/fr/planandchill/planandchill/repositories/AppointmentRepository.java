package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}