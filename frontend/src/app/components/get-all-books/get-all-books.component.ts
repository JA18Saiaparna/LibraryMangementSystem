import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from 'src/app/model/Book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-get-all-books',
  templateUrl: './get-all-books.component.html',
  styleUrls: ['./get-all-books.component.css']
})
export class GetAllBooksComponent {
  bookList:Book[] = [];
  constructor(private router:Router,private bookService:BookService){}
  getAllBooks(){
    
    this.bookService.getAll().subscribe( 
                              (list)=>{ 
                                this.bookList = list; 
                                 console.log(list);
                                alert("Displayed all books");
                              },
                              (error)=>{
                                console.log("Something went wrong")});
                                

        

}
deleteBook(bookid:number){
  this.bookService.deleteBook(bookid).subscribe((msg) => {
   console.log("Book is deleted");
    
    alert("Book is deleted");
  });
  
}
updateBook(bookid:number){
 this.router.navigate(['/updatebook']);
}
}
