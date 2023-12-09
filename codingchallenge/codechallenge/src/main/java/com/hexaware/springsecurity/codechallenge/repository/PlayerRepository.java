package com.hexaware.springsecurity.codechallenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.springsecurity.codechallenge.entities.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {
	
	@Query("SELECT p.teamName FROM Player p where countryName='India' ORDER BY p.teamName DESC ")
	public List<String> findByTeamName();



}
