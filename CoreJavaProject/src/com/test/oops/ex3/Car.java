package com.test.oops.ex3;

public abstract class Car {
	
	public abstract void start();
	
	public abstract void move();
	
	/*public void polina(){
		System.out.println("Carsssss()");
	}
	*/

	public void stop(){
		System.out.println("Carstop()");
		
	}
	public void execute(){
			start();
			move();
			stop();
			//polina();
			
			
		}
		
	

}
