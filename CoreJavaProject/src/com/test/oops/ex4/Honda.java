package com.test.oops.ex4;

public class Honda implements Car {
	
	
	public void move(){
		System.out.println("Hondamove()");
	}
	
	@Override
	public void start(){
		
		System.out.println("Hondastart()");
	}
	
	@Override
	public void stop(){
		System.out.println("Hondastop()");
		
	}
	

}
