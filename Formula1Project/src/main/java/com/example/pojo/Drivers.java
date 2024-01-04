package com.example.pojo;

public class Drivers {

	private int id;
	private String driverName;
	private String team;
	private int age;
	
	public Drivers(int id, String driverName, String team, int age) {
		this.id = id;
		this.driverName = driverName;
		this.team = team;
		this.age = age;
	}
	
	public Drivers( String driverName, String team, int age) {
		
		this.driverName = driverName;
		this.team = team;
		this.age = age;
	}
	
	public Drivers() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
