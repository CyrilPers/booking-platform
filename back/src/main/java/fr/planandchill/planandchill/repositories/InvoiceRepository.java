package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}