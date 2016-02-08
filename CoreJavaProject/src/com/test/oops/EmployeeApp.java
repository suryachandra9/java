package com.test.oops;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1111,"surya",456465f);
		Employee.count=100;
		Employee.printEmployeeCount();
		/*emp1.eno=101;
		emp1.ename="surya";
		emp1.salary=1235.5f;*/
		emp1.printDetails();
		System.out.println(+emp1.getEno()+ ","+emp1.getEname()+","+emp1.getSalary());
		emp1.count=200;
		Employee.printEmployeeCount();
		
		Employee emp2 = new Employee(56465);
		//emp2.eno=201;
		//emp2.ename="chandra";
		//emp2.salary=22235.5f;
		emp2.setEno(201);
		emp2.setEname("chandra");
		emp2.setSalary(22223.5f);
		emp2.printDetails();
		
	
		
	}

}
