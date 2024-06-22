package com.tnsif.employees;

public class Manager extends Employee{
	private int teamSize;
	
	public Manager(String name, int id, double salary, int teamSize) {
		// TODO Auto-generated constructor stub
		super(name, id, salary);
		this.teamSize = teamSize;
		
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
}
