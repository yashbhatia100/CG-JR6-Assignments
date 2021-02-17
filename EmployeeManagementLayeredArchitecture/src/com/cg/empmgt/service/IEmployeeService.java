package com.cg.empmgt.service;
import java.util.*;
import com.cg.empmgt.entities.Employee;

public interface IEmployeeService {
	Employee addEmployee(int id, String name, String department);

	Employee findById(int id);

	void removeById(int id);

	List<Employee>findAll();



}
