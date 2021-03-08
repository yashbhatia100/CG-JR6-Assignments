package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		Employee emp = context.getBean(Employee.class);
		SBU sbu = context.getBean(SBU.class);
		System.out.println("Employee Details \n--------------------------");
		System.out.println("Employee [empAge=" + emp.getAge() + ", empId=" + emp.getEmployeeId() + ", empName="
				+ emp.getEmployeeName() + ", empSalary=" + emp.getSalary());
		System.out.println("sbuDetails=SBU [sbuCode=" + sbu.getSbuId() + ", sbuHead=" + sbu.getSbuHead() + ", sbuName"
				+ sbu.getSbuName() + "]]");
		context.close();
	}

}
