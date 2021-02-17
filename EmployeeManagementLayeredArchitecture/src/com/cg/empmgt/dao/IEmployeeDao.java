package com.cg.empmgt.dao;

import java.util.*;
import com.cg.empmgt.entities.Employee;

public interface IEmployeeDao {
	void addEmployee(Employee employee);

	Employee findById(int id);

	void removeById(int id);

	List<Employee> findAll();

}
