package com.tnsif.location;

public class Country extends Continent{
	
	private String countryName;
	private String capital;

	public Country(String name, int area, String countryName, String capital) {
		// TODO Auto-generated constructor stub
		super(name, area);
		this.countryName = countryName;
		this.capital = capital;
	}
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [Country=" + countryName + ", Capital=" + capital + ", Continent =" + getName()
				+ ", Area=" + getArea() + "]";
	}
}
