package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.InvoiceLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceLineRepository extends JpaRepository<InvoiceLine, Integer> {
}