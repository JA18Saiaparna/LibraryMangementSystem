import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddemployeeComponent } from './components/addemployee/addemployee.component';
import { DisplayallComponent } from './components/displayall/displayall.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import{FormsModule} from '@angular/forms'
@NgModule({
  declarations: [
    AppComponent,
    AddemployeeComponent,
    DisplayallComponent,
    DashboardComponent
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
