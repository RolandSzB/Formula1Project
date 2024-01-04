package com.example.pojo;

import java.sql.Date;

public class Cars {
 
	private int id;
	private String teamName;
	private int wins;
	private String engine;
	private Date year;
	
	public Cars(int id, String teamName, int wins, String engine, Date year) {
		this.id = id;
		this.teamName = teamName;
		this.wins = wins;
		this.engine = engine;
		this.year = year;
	}
	public Cars( String teamName, int wins, String engine, Date year) {
		this.teamName = teamName;
		this.wins = wins;
		this.engine = engine;
		this.year = year;
	}
	public Cars() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	
	
	
	
}
