package com.cg.empmgt.dao;

import java.util.*;

import com.cg.empmgt.entities.Employee;

public class EmployeeStore {
	private EmployeeStore() {

	}

	public static Map<Integer, Employee> empStore = new HashMap<>();

}
