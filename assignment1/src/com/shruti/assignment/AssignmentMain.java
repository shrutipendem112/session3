package com.shruti.assignment;
import com.tnsif.employees.Developer;
import com.tnsif.employees.Manager;
import com.tnsif.utilities.EmployeeUtilities;

public class AssignmentMain {

	public AssignmentMain() {
		// TODO Auto-generated constructor stub
		super();
	}
	public static void main(String[] args) {
		Manager man = new Manager("Shruti", 20, 150000, 5);
		Developer dev = new Developer("John", 30, 120000, "java");
		
		System.out.println("Manager Details");
		EmployeeUtilities.printDetails(man);
		System.out.println();
		
		System.out.println("Developer Details");
		EmployeeUtilities.printDetails(dev);
	}
}