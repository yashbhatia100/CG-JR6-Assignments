package com.empmgt.entities;

public class Tester extends Employee {
	String tools;

	public Tester(int id, String name, Department department, String tools) {
		super(id, name, department);
		this.tools = tools;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

}
