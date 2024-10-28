package com.accenture.lkm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empObject")
class Employee {

	@Autowired
	static private Address address;

	@Value("1001")
	static private Integer employeeId;

	private Double salary;

	@Value("MSD")
	private String employeeName;

	public Employee() {
		System.out
				.println("From Constructor of Employee: Created the Employee Object and injected the Address Object\n");
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	

	public void setEmployeeId(Integer employeeId) {
		System.out.println("FRom setter of EmployeeId");
		Employee.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		System.out.println("From setter of Salary");
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void display() {
		System.out.println("\nEmployee Details are:");
		System.out.println("Employee ID:" + employeeId);
		System.out.println("Employee Salaray:" + this.salary);
		System.out.println("Emloyee Name: " + this.employeeName);
		System.out.println("\nAddress line1:" + address.getAddressLine1());
		System.out.println("Address line2:" + address.getAddressLine2());
	}
}