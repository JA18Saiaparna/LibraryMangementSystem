import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PlayerComponent } from './component/player/player.component';
import { GetallComponent } from './component/getall/getall.component';

import { DashboardComponent } from './component/dashboard/dashboard.component';
import { HomeComponent } from './component/home/home.component';
import { GetTeamsOfIndiaComponent } from './component/get-teams-of-india/get-teams-of-india.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'add',component:PlayerComponent},
  {path:'display',component:GetallComponent},
  {path:'getallnames',component:GetTeamsOfIndiaComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
