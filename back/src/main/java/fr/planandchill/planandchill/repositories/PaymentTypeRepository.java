package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Integer> {
}