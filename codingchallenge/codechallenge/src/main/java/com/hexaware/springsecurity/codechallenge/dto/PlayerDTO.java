package com.hexaware.springsecurity.codechallenge.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
public class PlayerDTO {
	 private Long playerId;
	  @NotNull
	  private String playerName;
	  @NotNull
	  private int jerseyNumber;
	  @NotNull
	  @Pattern(regexp = "^(batsmen|bowler|fielder|AllRounder|Keeper)$", message = "Invalid player type")
	  private String role;
	  private int totalMatches;
	  @NotBlank(message="Team name should not be blank")
	  private String teamName;
	  private String countryName;
	  @Size(max = 200, message = "Description should not exceed 200 characters")
	  private String description;
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public PlayerDTO(Long playerId, String playerName, int jerseyNumber, String role, int totalMatches, String teamName,
			String countryName, String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.countryName = countryName;
		this.description = description;
	}
	public PlayerDTO() {
		super();
	}
	  
}
