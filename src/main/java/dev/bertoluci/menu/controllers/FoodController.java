package dev.bertoluci.menu.controllers;

import dev.bertoluci.menu.core.food.Food;
import dev.bertoluci.menu.repositeries.FoodRepository;
import dev.bertoluci.menu.response.FoodRequestDTO;
import dev.bertoluci.menu.response.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);
    }

    @GetMapping
    public List<FoodResponseDTO> getAll() {

        List<FoodResponseDTO> foods = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foods;

    }

}
