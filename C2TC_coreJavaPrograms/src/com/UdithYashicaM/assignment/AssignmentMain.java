package com.UdithYashicaM.assignment;
import com.UdithYashicaM.assignment.Employees.*;
import com.UdithYashicaM.assignment.Utilities.EmployeeUtilities;

public class AssignmentMain {
	 public static void main(String[] args) {
		 Manager mgr = new Manager("Yash", 55 , 100000, 5);
	        Developer dev = new Developer("Jai", 20, 85000, "Java");

	        System.out.println("Manager Details:");
	        EmployeeUtilities.printEmployeeDetails(mgr);
	        System.out.println("Team Size: " + mgr.getTeamSize());
	        System.out.println("Annual Salary: " + EmployeeUtilities.calculateAnnualSalary(mgr));

	        System.out.println("\nDeveloper Details:");
	        EmployeeUtilities.printEmployeeDetails(dev);
	        System.out.println("Programming Language: " + dev.getProgrammingLanguage());
	        System.out.println("Annual Salary: " + EmployeeUtilities.calculateAnnualSalary(dev));
	    }
}
