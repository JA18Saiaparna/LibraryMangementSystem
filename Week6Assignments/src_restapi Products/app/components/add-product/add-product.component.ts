import { Component } from '@angular/core';
import { Product } from 'src/app/model/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {

  productList:Product[]=[];
  constructor(private productService:ProductService)
  {

  }
  insertProduct(body:Product)
  {
    this.productService.insert(body) .subscribe(
      (product)=>{console.log('Added product is: '+product);}
      );
  }
}
