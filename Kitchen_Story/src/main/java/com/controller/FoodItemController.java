package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.FoodItem;
import com.service.FoodItemService;

import java.util.List;

@RestController
@RequestMapping("/food-items")
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @GetMapping
    public List<FoodItem> getAllFoodItems() {
        return foodItemService.getAllFoodItems();
    }

    @PostMapping
    public void addFoodItem(@RequestBody FoodItem foodItem) {
        foodItemService.addFoodItem(foodItem);
    }
}
