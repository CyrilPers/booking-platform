package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Integer> {
}