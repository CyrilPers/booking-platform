package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}