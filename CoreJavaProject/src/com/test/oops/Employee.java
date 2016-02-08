package com.test.oops;

public class Employee {
	private int eno;
	private String ename;
	private float salary;
	
	static int count;
	
public static void printEmployeeCount(){
	System.out.println("Employee count==" + count);
}
	
public void setEno(int eno){
	System.out.println("previous value :" + this.eno+"current value :" + eno);
	this.eno=eno;
}	
public void setEname(String ename){
	System.out.println("previous value :" + this.ename+"current value :" + ename);
	this.ename=ename;
}	
public void setSalary(float salary){
	System.out.println("previous value :" + this.salary+"current value :" + salary);
	this.salary=salary;
}	
public int getEno(){
	return eno;
}
public String getEname(){
	return ename;
}
public float getSalary(){
	return salary;
}

public Employee(){
	System.out.println("default construtor");
}	
	
public Employee(int eno){
	eno=eno;
	System.out.println("constructor with single  eno====" + eno);
}	

public Employee(int eno, String ename,float salary ){
	this.eno=eno;
	this.ename=ename;
	this.salary=salary;
	System.out.println("constructor with three parameters eno,ename,salary====" + eno+","+ename+","+salary);
}	

	public void printDetails(){
		System.out.println("eno====" + eno);
		System.out.println("ename ====" + ename);
		System.out.println("salary ====" + salary);
		System.out.println("federal tax ==" + (salary*0.3));
	}
	
}
