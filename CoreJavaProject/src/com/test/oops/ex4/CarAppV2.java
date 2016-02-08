package com.test.oops.ex4;

public class CarAppV2  {

	public static void main (String[] args)throws Exception{
		Car carRef = null;
		Class classRef = Class.forName(args[0]);
		Object objectRef = classRef.newInstance();
		carRef=(Car)objectRef; //type cast
		
		
		carRef.start();
		carRef.move();
		carRef.stop();
		
		
		
		

	}

}
