package com.UdithYashicaM.assignment;
import com.UdithYashicaM.assignment.Employees.*;
import com.UdithYashicaM.assignment.Utilities.EmployeeUtilities;

public class AssignmentMain {
	 public static void main(String[] args) {
		 Manager mgr = new Manager("Yashi", 55 , 100000, 5);
	        Developer dev = new Developer("Jai", 20, 85000, "Java");

	        System.out.println("Manager Details:");
	        EmployeeUtilities.printshowDetails(mgr);
	        System.out.println("Team Sizes: " + mgr.getTeamSizes());
	        System.out.println("Annual Salary: " + EmployeeUtilities.calculateAnnualSalary(mgr));

	        System.out.println("\nDeveloper Details:");
	        EmployeeUtilities.printshowDetails(dev);
	        System.out.println("Programming Languages: " + dev.getProgrammingLanguages());
	        System.out.println("Annual Salary: " + EmployeeUtilities.calculateAnnualSalary(dev));
	    }
}
