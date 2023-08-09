import { Component, OnInit } from '@angular/core';
import { AdminService } from './admin.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  foodItems: any;

  constructor(private adminService: AdminService) { }

  ngOnInit(): void {
    this.adminService.getAllFoodItems().subscribe(data => {
      this.foodItems = data;
    });
  }

  addFoodItem(foodItem: Object): void {
    this.adminService.addFoodItem(foodItem).subscribe(() => {
      this.ngOnInit(); // Refresh the food items
    });
  }

  // Additional methods to handle removal, etc.
}
