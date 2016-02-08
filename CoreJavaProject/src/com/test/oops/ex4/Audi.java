package com.test.oops.ex4;

public class Audi implements Car{
	
	public void start(){
		System.out.println("Audistart()");
	}

	@Override
	public void move() {
		System.out.println("Audimove()");
		
	}

	@Override
	public void stop() {
		System.out.println("Audistop()");	
		
	}
	

}
