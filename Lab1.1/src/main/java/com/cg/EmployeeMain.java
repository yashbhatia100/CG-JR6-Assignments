package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		
		Employee employee = context.getBean(Employee.class);
		System.out.println("Employee Details");
		System.out.println("--------------------------");
		System.out.println("Employee ID : "+employee.getEmployeeId()+"\nEmployee Name: "+employee.getEmployeeName()+"\nEmployee Salary: "+employee.getSalary()
		+"\nEmployee BU : "+employee.getBusinessunit()+"\nEmployeeAge : "+employee.getAge());
		context.close();

	}

}
