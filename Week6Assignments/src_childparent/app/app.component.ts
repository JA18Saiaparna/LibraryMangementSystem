import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';

  parentData:string="Hello I am Parent";//it canbe any type of data json,arrays..etc

  parentObj={'id':101,'name':'sai','city':'hyd'};

  getChildData(data:any)
  {
    console.log(data);
  }
}

