import { Component } from '@angular/core';
import { Player } from 'src/app/model/player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent {
  constructor(private playerService:PlayerService){}
  addPlayer(data:Player){
    
    this.playerService.addPlayer(data)
    .subscribe(
      (emp)=>{console.log('Added Player is: '+emp);}
      );


   

}
}
