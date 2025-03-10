package dev.bertoluci.menu.response;

import dev.bertoluci.menu.core.food.Food;

import java.util.UUID;

public record FoodResponseDTO(UUID id, String title, String image, Integer price) {

    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
