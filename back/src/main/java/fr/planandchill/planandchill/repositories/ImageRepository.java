package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}