package com.hexaware.springsecurity.codechallenge.restcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hexaware.springsecurity.codechallenge.dto.PlayerDTO;
import com.hexaware.springsecurity.codechallenge.entities.Player;
import com.hexaware.springsecurity.codechallenge.service.IPlayerService;

import jakarta.validation.Valid;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/player")
public class PlayerRestController {
    
	@Autowired
	IPlayerService playerService;
	@PostMapping(value="/addplayer",consumes = "application/json", produces = "application/json")
	public Player addPlayer(@RequestBody @Valid PlayerDTO playerDTO)
	{
		return playerService.addPlayer(playerDTO);
	}
	@GetMapping(value="/getall")
	public List <Player> getAllPlayers() 
	{
		return playerService.getAllPlayers();
	}
	
	public String deletePlayer(Long playerId)
	{
		playerService.deletePlayer(playerId);
		return "Player Deleted";
	}
	@GetMapping(value="/getallnames")
	public List<String> findByTeamName()
	{
		return playerService.findByTeamName();
	}
}
