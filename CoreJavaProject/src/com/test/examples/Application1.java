package com.test.examples;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my first java program");
		
		
		calculateInterest(1000,2,12);
		
		int interestAmount = calculateSimpleInterest(5000,4,36);
		
		System.out.println("total amount =" + (interestAmount+ 5000));
		
		
	
	}
	public static void calculateInterest(int amount, int rate, int months ){
		
		int interest = (amount*rate*months)/100;
		
		System.out.println("interest1=" + interest);
		
	}
	public static int calculateSimpleInterest(int amount, int rate, int months ){
		
		int interest = (amount*rate*months)/100;
		
		System.out.println("interest2=" + interest);
		return interest;
		
	}
}
