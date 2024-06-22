package com.tnsif.employees;

public class Developer extends Employee{

	private String progLang;
	public String getProgLang() {
		return progLang;
	}
	public void setProgLang(String progLang) {
		this.progLang = progLang;
	}
	public Developer(String name, int id, double salary, String progLang) {
		// TODO Auto-generated constructor stub
		super(name, id, salary);
		this.progLang = progLang;
	}
}
