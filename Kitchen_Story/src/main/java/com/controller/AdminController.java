package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.FoodItem;
import com.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/add-food-item")
    public void addFoodItem(@RequestBody FoodItem foodItem) {
        adminService.addFoodItem(foodItem);
    }

    @DeleteMapping("/remove-food-item/{id}")
    public void removeFoodItem(@PathVariable Long id) {
        adminService.removeFoodItem(id);
    }

   
}

