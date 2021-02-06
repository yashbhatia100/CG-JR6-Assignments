package com.empmgt.entities;

public class Employee {
	private int id;
	private String name;
	private Department department;

	public int getId() {
		return id;
	}

	public Employee() {
		this.id = 0;
		this.name = "Not given";
		this.department = null;
	}

	public Employee(int id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
