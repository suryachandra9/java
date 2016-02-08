package com.test.oops.ex3;

public class CarApp {

	public static void main(String[] args) {
		Car carRef = null;
		if(args[0].equals("Nissan")){
			carRef = new Nissan();
			//Nissan nissanObj = new Nissan();
			//nissanObj.start();
			//nissanObj.move();
			//nissanObj.stop();
		}else if(args[0].equals("Honda")){
			carRef = new Honda();
			//hondaObj.start();
			//hondaObj.move();
			//hondaObj.stop();
		}else if(args[0].equals("Audi")){
			carRef = new Audi();
			//audiObj.start();
			//audiObj.move();
			//audiObj.stop();
		}else{
			System.out.println("No car is available");
			System.exit(0);
		}
		carRef.start();
		carRef.move();
		carRef.stop();

	}

}
