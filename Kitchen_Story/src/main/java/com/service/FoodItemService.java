package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.FoodItem;
import com.repo.FoodItemRepository;

import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepository;

    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItemRepository.save(foodItem);
    }

    
}
