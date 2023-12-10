import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-search-by-id',
  templateUrl: './search-by-id.component.html',
  styleUrls: ['./search-by-id.component.css']
})
export class SearchByIdComponent {
  empList:Employee[] =[];
  employee: Employee | undefined;
  constructor(private service:EmployeeService){}

  
   search(formData: any) {
    const id = formData.employeeId; // Retrieve the employee ID from the form data
    this.service.getEmployeeById(id)
      .subscribe((employee: Employee) => {
        console.log('Retrieved Employee:', employee);
        this.employee = employee; // Update the employee details
      });


      
    

    


}

}
