package com.cg.apps.employeemsrest.dto;

public class ChangeNameRequest {
	public int getId() {
		return id;
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
	int id;
	String name;

}