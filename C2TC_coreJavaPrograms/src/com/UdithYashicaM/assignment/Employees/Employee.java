package com.UdithYashicaM.assignment.Employees;

public class Employee {
	private String name;
    private int EmployeeId;
    private double salary;

    // Constructor
    public Employee(String name, int EmployeeId, double salary) {
        this.name = name;
        this.EmployeeId = EmployeeId;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEmployeeId() { return EmployeeId; }
    public void setEmployeeId(int EmployeeId) { this.EmployeeId = EmployeeId; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
