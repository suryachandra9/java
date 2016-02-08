package com.test.oops;

public class PenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen();
		p1.setColor("red");
		//p1.color ="red";
		p1.write();
		System.out.println(p1);
		System.out.println(p1.toString());
		
		Pen p2 = new Pen("green");
		//p2.color ="red";
		p2.write();
		System.out.println(p2);
		System.out.println(p2.toString());
	}

}
