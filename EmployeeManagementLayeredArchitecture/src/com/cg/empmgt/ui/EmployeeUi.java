package com.cg.empmgt.ui;

import java.util.*;
import com.cg.empmgt.entities.Employee;
import com.cg.empmgt.exceptions.*;
import com.cg.empmgt.service.*;

public class EmployeeUi {
	private IEmployeeService service = new EmployeeServiceImpl();

	public static void main(String args[]) {

		EmployeeUi app = new EmployeeUi();
		app.start();

	}

	void start() {
		try {
			Employee yash = service.addEmployee("Yash ", "IT");
			display(yash);
			Employee yash1 = service.addEmployee("Yash1", "HR");
			display(yash1);
			Employee yash2 = service.addEmployee( "Yash2", "IT");
			display(yash2);

			System.out.println("******Printing by id****");
			Employee fetchedEmployee = service.findById(yash1.getId());
			display(fetchedEmployee);
			service.removeById(2);

			System.out.println("**displaying all students***");
			List<Employee> list = service.findAll();
			findAll(list);

		} catch (InvalidIdException e) {
			System.out.println("Sorry Invalid Id Entered");
		} catch (InvalidDepartmentException e) {
			System.out.println("Sorry Department is not correct");
		} catch (InvalidEmployeeNameExcpetion e) {
			System.out.println("Sorry Employee name is not correct");
		} catch (Exception e) {
			System.out.println("Sorry Please Try Again");
		}
	}

	public void findAll(Collection<Employee> employees) {
		for (Employee employee : employees) {
			display(employee);
		}
	}

	public void display(Employee employee) {
		System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getDepartment());
	}

}