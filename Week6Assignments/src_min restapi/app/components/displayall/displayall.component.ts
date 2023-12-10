import { Component } from '@angular/core';
import { Employee } from 'src/app/model/employee';

import { EmployeeService } from 'src/app/services/employee.service';


@Component({
  selector: 'app-displayall',
  templateUrl: './displayall.component.html',
  styleUrls: ['./displayall.component.css']
})
export class DisplayallComponent {
 empList:Employee[]=[];
 constructor(private empService:EmployeeService){}
 getAllEmployees()
 {
  this.empService.getAll();
 }
}
