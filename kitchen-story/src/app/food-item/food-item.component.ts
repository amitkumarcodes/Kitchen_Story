import { Component, OnInit } from '@angular/core';
import { FoodItemService } from './food-item.service';

@Component({
  selector: 'app-food-item',
  templateUrl: './food-item.component.html',
  styleUrls: ['./food-item.component.css']
})
export class FoodItemComponent implements OnInit {

  foodItems: any;

  constructor(private foodItemService: FoodItemService) { }

  ngOnInit(): void {
    this.foodItemService.getAllFoodItems().subscribe((data: any) => {
      this.foodItems = data;
    });
  }

  .
}
