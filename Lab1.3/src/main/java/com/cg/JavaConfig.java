package com.cg;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@PropertySource("Employee.properties")
@ComponentScan("com.cg")
@Configuration

public class JavaConfig {
	@Autowired
Environment env;	
	
	@Bean
	public SBU sbu(){
		SBU sbu = new SBU();
		String sbuId=env.getProperty("sbu.id");
		String sbuName=env.getProperty("sbu.name");
		String sbuHead=env.getProperty("sbu.head");
		sbu.setSbuId(sbuId);
		sbu.setSbuHead(sbuHead);
		sbu.setSbuName(sbuName);
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		int empId1=env.getProperty("emp1.id", Integer.class);
		String empName1=env.getProperty("emp1.name");
		int empAge1=env.getProperty("emp1.age",Integer.class);
		int empSalary1=env.getProperty("emp1.salary", Integer.class);
		
		emp1.setEmployeeId(empId1);
		emp1.setEmployeeName(empName1);
		emp1.setAge(empAge1);
		emp1.setSalary(empSalary1);

		int empId2=env.getProperty("emp2.id", Integer.class);
		String empName2=env.getProperty("emp2.name");
		int empAge2=env.getProperty("emp2.age",Integer.class);
		int empSalary2=env.getProperty("emp2.salary", Integer.class);

		emp2.setEmployeeId(empId2);
		emp2.setEmployeeName(empName2);
		emp2.setAge(empAge2);
		emp2.setSalary(empSalary2);
		
		List <Employee> list =new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		sbu.setEmpList(list);
		return sbu;
		
	}
}
