package com.IplAuction;

import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player_auction")
public class Auction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Player_name")
	private String playerName;
	@Column(name="previous_team")
	private String previousTeam;
	@Column(name="base_price")
	private double basePrice;
	@Column(name="new_team")
	private String newTeam;
	@Column(name="final_price")
	private double finalPrice;
	public Auction() {
		
	}
	public Auction(String playerName, String previousTeam, double basePrice, String newTeam, double finalPrice) {
		super();
		this.playerName = playerName;
		this.previousTeam = previousTeam;
		this.basePrice = basePrice;
		this.newTeam = newTeam;
		this.finalPrice = finalPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPreviousTeam() {
		return previousTeam;
	}
	public void setPreviousTeam(String previousTeam) {
		this.previousTeam = previousTeam;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public String getNewTeam() {
		return newTeam;
	}
	public void setNewTeam(String newTeam) {
		this.newTeam = newTeam;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	@Override
	public String toString() {
		return "Auction [id=" + id + ", playerName=" + playerName + ", previousTeam=" + previousTeam + ", basePrice="
				+ basePrice + ", newTeam=" + newTeam + ", finalPrice=" + finalPrice + "]";
	}
	
	
	
}
