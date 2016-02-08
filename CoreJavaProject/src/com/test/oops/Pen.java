package com.test.oops;

public class Pen {
	private String color;
	//public String color;
	
	
	public Pen(String color) {
		
		this.color = color;
	}

	@Override
	public String toString() {
		return "pen color [" +color+ "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void write(){
	System.out.println("color ="+ color);	
	}
	public Pen(){
		//no op
	}

}
