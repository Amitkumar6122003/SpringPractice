package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    
	@Value("111")
	private int employee_id;
	@Value("rahul")
	private String name;
	@Value("15LPA")
	private String salary;
	
    @Autowired
	private Country con;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", name=" + name + ", salary=" + salary + ", con=" + con + "]";
	}

	public Employee(int employee_id, String name, String salary, Country con) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.salary = salary;
		this.con = con;
	}

	public Employee() {
		super();
	}
	
	
}
