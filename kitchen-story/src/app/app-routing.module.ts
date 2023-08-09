import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FoodItemComponent } from './food-item/food-item.component';
import { OrderComponent } from './order/order.component';
import { AdminComponent } from './admin/admin.component';

const routes: Routes = [
  { path: 'food-items', component: FoodItemComponent },
  { path: 'orders', component: OrderComponent },
  { path: 'admin', component: AdminComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
