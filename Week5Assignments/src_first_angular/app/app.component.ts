import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';
  email:string="";
  pwd:string="";
  checkbox:any="";

  readFormData(data:any)
  {
    console.log(data.form.value);
  }
}
