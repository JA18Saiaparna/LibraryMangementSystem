import { Component } from '@angular/core';
import { Book } from 'src/app/model/Book';
import { UserService } from 'src/app/services/userlogin.service';

@Component({
  selector: 'app-displaybooks',
  templateUrl: './displaybooks.component.html',
  styleUrls: ['./displaybooks.component.css']
})
export class DisplaybooksComponent {
  bookList: Book[] = []; 

  constructor(private bookService: UserService) {}

  getAllBooks() {
    
    this.bookService.getAll().subscribe(
      (data) => {
        this.bookList = data; 
      },
      (error) => {
        console.error('Error fetching books:', error);
      }
      );
    }
}
