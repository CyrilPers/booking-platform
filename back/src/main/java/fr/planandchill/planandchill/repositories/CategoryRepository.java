package fr.planandchill.planandchill.repositories;

import fr.planandchill.planandchill.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}