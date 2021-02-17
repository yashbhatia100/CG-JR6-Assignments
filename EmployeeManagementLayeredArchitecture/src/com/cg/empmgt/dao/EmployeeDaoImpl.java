package com.cg.empmgt.dao;

import java.util.*;

import com.cg.empmgt.entities.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
	private int generateId;
	public int generateId() {
	 generateId++;
		return generateId;
	}

	@Override
	public void addEmployee(Employee employee) {
		Map<Integer, Employee> empStore = EmployeeStore.empStore;
		int id=generateId();
		employee.setId(id);
		empStore.put(id, employee);

	}

	@Override
	public Employee findById(int id) {
		Map<Integer, Employee> empStore = EmployeeStore.empStore;
		Employee employee = empStore.get(id);
		return employee;

	}

	@Override
	public void removeById(int id) {
		Map<Integer, Employee> empStore = EmployeeStore.empStore;
		Employee employee = empStore.remove(id);

	}

	@Override
	public List<Employee> findAll() {
		Map<Integer, Employee> empStore = EmployeeStore.empStore;
		Collection<Employee> employees = empStore.values();
		List<Employee> list = new ArrayList<>(employees);
		return list;

	}

}
