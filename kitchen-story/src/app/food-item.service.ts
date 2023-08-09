import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FoodItemService {

  private baseUrl = 'http://localhost:8080/food-items';

  constructor(private http: HttpClient) { }

  getAllFoodItems(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  addFoodItem(foodItem: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, foodItem);
  }

  
}
