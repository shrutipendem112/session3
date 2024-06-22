package com.tnsif.utilities;

import com.tnsif.employees.Developer;
import com.tnsif.employees.Employee;
import com.tnsif.employees.Manager;

public class EmployeeUtilities {

	public static void printDetails(Employee emp) {
		// TODO Auto-generated constructor stub
		System.out.println("Employee name: " + emp.getName());
		System.out.println("Employee Id: " + emp.getId());
		System.out.println("Employee salary: " + emp.getSalary());
		
		if(emp instanceof Manager) {
			Manager manager = (Manager) emp;
			System.out.println("Team Size is " +manager.getTeamSize());
		}else if (emp instanceof Developer) {
			Developer developer = (Developer) emp;
			System.out.println("Programming Language is " +developer.getProgLang());
		}
	}
}
