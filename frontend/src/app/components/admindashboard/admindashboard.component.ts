import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent {
  constructor(private router: Router) { }

  manageBooks() {
    
    this.router.navigate(['/managebooks']); 
  }

  manageUsers() {
    
    this.router.navigate(['/manageusers']); 
  }




}
