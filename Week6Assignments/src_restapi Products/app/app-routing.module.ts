import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddProductComponent } from './components/add-product/add-product.component';
import { DisplayAllComponent } from './components/display-all/display-all.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';

const routes: Routes = [
   {path:'home',component:DashboardComponent},
    {path:'add-product',component:AddProductComponent},
    {path:'display-all',component:DisplayAllComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
