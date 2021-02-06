package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain empProject = new EmployeeMain();
		empProject.Start();

	}

        void Start() {
		Employee customerStore[] = new Employee[4];
		Department dept1 = new Department("Department1", "Developer");
		Department dept2 = new Department("Department1", "Developer");
		Department dept3 = new Department("Department2", "Tester");
		Department dept4 = new Department("Department2", "Tester");

		Developer developer1 = new Developer(1, "abc", dept1, "Java");
		Developer developer2 = new Developer(2, "def", dept2, "C");
		Tester tester1 = new Tester(3, "ghi", dept3, "Manual");
		Tester tester2 = new Tester(4, "xyz", dept4, "Auto");
		customerStore[0] = developer1;
		customerStore[1] = tester1;
		customerStore[2] = developer2;
		customerStore[3] = tester2;

		for (int i = 0; i < customerStore.length; i++) {
			Employee iteratedemp = customerStore[i];
			if (iteratedemp instanceof Developer) {
				Developer developer = (Developer) iteratedemp;
				displayDeveloper(developer);

			}

			if (iteratedemp instanceof Tester) {
				Tester tester = (Tester) iteratedemp;
				displayTester(tester);

			}
		}
	}

	void displayEmployees(Employee emp)
		{
			int id=emp.getId();
			String name=emp.getName();
			Department dept=emp.getDepartment();
			String deptId=dept.getDeptId();
			String deptName=dept.getDeptName();
			System.out.println("EmployeeId "+ id +" Name "+ name + " DepartmentId " + deptId + " DepartmentName " + deptName );
			
			
		}
	void displayDeveloper(Developer emp){
		displayEmployees(emp);
		String language=emp.getLanguage();
		System.out.println("Language used is " + language);
	}
	
	void displayTester(Tester emp){
		displayEmployees(emp);
		String tool=emp.getTools();
		System.out.println("Tool used is " + tool);
	}
	

}
