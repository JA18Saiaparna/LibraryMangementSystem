package com.hexaware.springsecurity.codechallenge.service;

import java.util.List;

import com.hexaware.springsecurity.codechallenge.dto.PlayerDTO;
import com.hexaware.springsecurity.codechallenge.entities.Player;

public interface IPlayerService {
  public Player addPlayer(PlayerDTO playerDTO);
  public List <Player> getAllPlayers();
  public void deletePlayer(Long playerId);
  public List<String> findByTeamName();
}
