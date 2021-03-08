package com.cg;

import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		System.out.println("SBU Details\n-------------------------");
		SBU sbu = context.getBean(SBU.class);
		System.out.println(
				"sbuCode=" + sbu.getSbuId() + ", sbuHead=" + sbu.getSbuHead() + ", sbuName" + sbu.getSbuName());

		System.out.println("Employee Details\n------------------------------");
		List<Employee> empList = sbu.getEmpList();
		empList.stream().forEach(emp -> System.out.println("EmployeeID : " + emp.getEmployeeId() + " EmployeeName : "
				+ emp.getEmployeeName() + " EmployeeAge : " + emp.getAge() + " EmployeeSalary : " + emp.getSalary()));

		context.close();
	}

}
