import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-search-by-id',
  templateUrl: './search-by-id.component.html',
  styleUrls: ['./search-by-id.component.css']
})
export class SearchByIdComponent {

  constructor(private service:EmployeeService){}

  
  search(id: number) {
    this.service.getEmployeeById(id)
      .subscribe((employee: Employee) => {
        console.log('Retrieved Employee:', employee);
        });
    

    


}

}
