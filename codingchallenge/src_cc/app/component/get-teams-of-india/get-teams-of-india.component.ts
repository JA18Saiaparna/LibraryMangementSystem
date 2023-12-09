import { Component } from '@angular/core';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-get-teams-of-india',
  templateUrl: './get-teams-of-india.component.html',
  styleUrls: ['./get-teams-of-india.component.css']
})
export class GetTeamsOfIndiaComponent {
  filteredPlayerList: any[] = [];
  selectedCountry: string = ''; 
  constructor(private playerService: PlayerService) {}

  getIndianTeams() {
    
  this.playerService.getTeamsOfIndia().subscribe((data: any[]) => {
  console.log(data);
  this.filteredPlayerList = data;
  console.log(this.filteredPlayerList );
});}

}
