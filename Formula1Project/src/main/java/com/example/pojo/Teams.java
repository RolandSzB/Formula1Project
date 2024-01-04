package com.example.pojo;

import java.sql.Date;

public class Teams {

	private int id;
	private String teamName;
	private String teamPrincipal;
	private Date joiningYear;
	
	public Teams(int id, String teamName, String teamPrincipal, Date joiningYear) {
		this.id = id;
		this.teamName = teamName;
		this.teamPrincipal = teamPrincipal;
		this.joiningYear = joiningYear;
	}
	public Teams( String teamName, String teamPrincipal, Date joiningYear) {
		this.teamName = teamName;
		this.teamPrincipal = teamPrincipal;
		this.joiningYear = joiningYear;
	}
	
	public Teams() {}

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

	public String getTeamPrincipal() {
		return teamPrincipal;
	}

	public void setTeamPrincipal(String teamPrincipal) {
		this.teamPrincipal = teamPrincipal;
	}

	public Date getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(Date joiningYear) {
		this.joiningYear = joiningYear;
	}
	
	
	
	
}
