import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PlayerComponent } from './component/player/player.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { GetallComponent } from './component/getall/getall.component';

import { HomeComponent } from './component/home/home.component';
import { GetTeamsOfIndiaComponent } from './component/get-teams-of-india/get-teams-of-india.component';

@NgModule({
  declarations: [
    AppComponent,
    PlayerComponent,
    DashboardComponent,
    GetallComponent,
   
    HomeComponent,
    GetTeamsOfIndiaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
