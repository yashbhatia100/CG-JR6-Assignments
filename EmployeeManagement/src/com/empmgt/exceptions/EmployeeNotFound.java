package com.empmgt.exceptions;

public class EmployeeNotFound extends RuntimeException {
	public EmployeeNotFound(String msg) {
		super(msg);

	}
}
