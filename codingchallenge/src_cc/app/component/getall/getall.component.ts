import { Component } from '@angular/core';
import { Player } from 'src/app/model/player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-getall',
  templateUrl: './getall.component.html',
  styleUrls: ['./getall.component.css']
})
export class GetallComponent {
  allPlayers:Player[] = [];

  constructor(private playerService:PlayerService){}

getAll(){
  
    this.playerService.getAll().subscribe( 
                              (list)=>{ this.allPlayers = list;  console.log(list)}
                              
                                );

}
}
