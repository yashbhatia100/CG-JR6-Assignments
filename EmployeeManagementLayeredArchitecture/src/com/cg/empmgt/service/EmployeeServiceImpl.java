package com.cg.empmgt.service;

import java.util.List;

import com.cg.empmgt.dao.*;
import com.cg.empmgt.entities.*;
import com.cg.empmgt.exceptions.*;

public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDao dao = new EmployeeDaoImpl();

	@Override
	public Employee addEmployee(int id,String name, String department) {
		validateId(id);
		validateName(name);
		validateDepartment(department);
		Employee employee = new Employee(id,name, department);
		dao.addEmployee(employee);
		return employee;

	}

	@Override
	public Employee findById(int id) {
		validateId(id);
		Employee employee = dao.findById(id);
		return employee;

	}

	@Override
	public void removeById(int id) {
		validateId(id);
		dao.removeById(id);
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = dao.findAll();
		return employees;
	}

	void validateId(int id) {
		if (id < 0) {
			throw new InvalidIdException("id should not be negative");
		}
	}

	void validateName(String name) {
		if (name == null || name.isEmpty() || name.trim().isEmpty() || name.length()>10) {
			throw new InvalidEmployeeNameExcpetion("name can't be null or empty");
		}
	}

	void validateDepartment(String department) {
		if (department == null || department.isEmpty() || department.trim().isEmpty() || department.length()>5) {
			throw new InvalidDepartmentException("Department can't be null or empty");
		}
	}

}
