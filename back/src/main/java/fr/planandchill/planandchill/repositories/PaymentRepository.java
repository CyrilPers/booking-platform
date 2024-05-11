package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}