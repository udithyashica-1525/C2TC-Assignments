package com.UdithYashicaM.assignment.Employees;

public class Developer extends Employee {
		    private String programmingLanguages;

		    public Developer(String name, int employeeId, double salary, String programmingLanguages) {
		        super(name, employeeId, salary);
		        this.programmingLanguages = programmingLanguages;
		    }

		    public String getProgrammingLanguages() { return programmingLanguages; }
		    public void setProgrammingLanguages(String programmingLanguages) { this.programmingLanguages = programmingLanguages; }
}
