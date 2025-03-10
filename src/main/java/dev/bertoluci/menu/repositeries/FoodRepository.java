package dev.bertoluci.menu.repositeries;

import dev.bertoluci.menu.core.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodRepository extends JpaRepository<Food, UUID> {
}
