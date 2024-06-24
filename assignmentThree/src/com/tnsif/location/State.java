package com.tnsif.location;

public class State extends Country{
	
	private String language;
	private String stateName;
	
//	public State() {
//		// TODO Auto-generated constructor stub
//	}

	public State(String name, int area, String countryName, String capital, String stateName, String language) {
		super(name, area, countryName, capital);
		// TODO Auto-generated constructor stub
		this.stateName = stateName;
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [language=" + language + ", stateName=" + stateName + ", Country Capital =" + getCapital()
				+ ", Country=" + getCountryName() + "]";
	}

	
}
