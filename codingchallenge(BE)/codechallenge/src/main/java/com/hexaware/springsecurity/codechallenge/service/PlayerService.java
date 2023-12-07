package com.hexaware.springsecurity.codechallenge.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hexaware.springsecurity.codechallenge.dto.PlayerDTO;
import com.hexaware.springsecurity.codechallenge.entities.Player;
import com.hexaware.springsecurity.codechallenge.repository.PlayerRepository;
import java.util.List;
@Service
public class PlayerService implements IPlayerService {
    @Autowired
	PlayerRepository playerRepo;
	
	@Override
	public Player addPlayer(PlayerDTO playerDTO) {
      Player player=new Player();
      player.setPlayerId(playerDTO.getPlayerId());
      player.setPlayerName(playerDTO.getPlayerName());
      player.setJerseyNumber(playerDTO.getJerseyNumber());
      player.setRole(playerDTO.getRole());
      player.setTotalMatches(playerDTO.getTotalMatches());
      player.setTeamName(playerDTO.getTeamName());
      player.setCountryName(playerDTO.getCountryName());
      player.setDescription(playerDTO.getDescription());
      return playerRepo.save(player);
	}

	@Override
	public List <Player> getAllPlayers() {
		return playerRepo.findAll();
	}

	@Override
	public void deletePlayer(Long playerId) {
		playerRepo.deleteById(playerId);
		
	}

	@Override
	public List<String> findByTeamName() {
		// TODO Auto-generated method stub
		return playerRepo.findByTeamName();
	}

	
	

	

	
	

	
}
