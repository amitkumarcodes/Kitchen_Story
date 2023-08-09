package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Admin;
import com.model.FoodItem;
import com.repo.AdminRepository;
import com.repo.FoodItemRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private FoodItemRepository foodItemRepository;

    public void addFoodItem(FoodItem foodItem) {
        foodItemRepository.save(foodItem);
    }

    public void removeFoodItem(Long id) {
        foodItemRepository.deleteById(id);
    }

    public Admin findAdminByUsername(String username) {
        return adminRepository.findById(username).orElse(null);
    }

   
}
