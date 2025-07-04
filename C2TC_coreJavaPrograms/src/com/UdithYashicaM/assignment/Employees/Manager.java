package com.UdithYashicaM.assignment.Employees;

public class Manager 
	extends Employee {
	    private int teamSizes;

	    public Manager(String name, int employeeId, double salary, int teamSizes) {
	        super(name, employeeId, salary);
	        this.teamSizes = teamSizes;
	    }

	    public int getTeamSizes() { return teamSizes; }
	    public void setTeamSizes(int teamSizes) { this.teamSizes = teamSizes; }
	
}
