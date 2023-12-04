import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Borrow } from 'src/app/model/borrow';
import { BorrowbooksService } from 'src/app/services/borrowbooks.service';
import { JwtClientService } from 'src/app/services/jwt-client.service';
import { UserService } from 'src/app/services/userlogin.service';

@Component({
  selector: 'app-borrowbooks',
  templateUrl: './borrowbooks.component.html',
  styleUrls: ['./borrowbooks.component.css']
})
export class BorrowbooksComponent {
 
 

  constructor(private borrowService: BorrowbooksService,private router: Router) {}

  submitForm(data:Borrow) {
    this.borrowService.addBorrowing(data)
      .subscribe((response)=> {
        console.log('Response from backend:', response);
        
      });
    }
      goBack ()
      {
        this.router.navigate(['/userdashboard']); 
      }  
    
  
  

  
}
