import { Component } from '@angular/core';
import { Product } from 'src/app/model/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-display-all',
  templateUrl: './display-all.component.html',
  styleUrls: ['./display-all.component.css']
})
export class DisplayAllComponent {


  productList:Product[] = [];

  constructor(private productService:ProductService){}

getAllProducts(){
  
    this.productService.getAll().subscribe( 
                              (list)=>{ this.productList = list;  console.log(list)}
                              
                                );

        

}
}
