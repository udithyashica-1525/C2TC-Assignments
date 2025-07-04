package com.UdithYashicaM.assignment.Utilities;
import com.UdithYashicaM.assignment.Employees.*;


public class EmployeeUtilities {
	public static void printshowDetails(Employee e) {
        System.out.println("Name: " + e.getName());
        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Salary: " + e.getSalary());
    }

    public static double calculateAnnualSalary(Employee e) {
        return e.getSalary() * 12;
    }

}
