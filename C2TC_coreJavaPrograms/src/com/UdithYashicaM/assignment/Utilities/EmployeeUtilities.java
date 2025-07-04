package com.UdithYashicaM.assignment.Utilities;

import com.UdithYashicaM.assignment.Employees.Employee;

/**
 * Utility class for Employee operations.
 */
public class EmployeeUtilities {

    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    public static double calculateAnnualSalary(Employee emp) {
        return emp.getSalary() * 12;
    }
}