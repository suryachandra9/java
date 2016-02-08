package com.test.oops.ex3;

public class Honda extends Car {
	
	
	public void move(){
		System.out.println("Hondamove()");
	}

	@Override
	public void start() {
		
		System.out.println("Hondastart()");
	}
	

}
