//The program contains a class Vehicle1 which is extended by other 3 classes i.e Bus1,Truck1,Car1;
//Road2 class displays the various properties of Car, Bus, Truck class 
//by just invoking their superclass Constructor

package com.hsbc.day3;

public class Road2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("TYPE  |  BRAND    | Color    | NO. of Wheels");
			new Car1("Maruti", "Red", 4);
			new Bus1("Tata", "Black", 6);
			new Truck1("Hundai", "Yellow", 8);
	}

}

class Vehicle1{
	
	protected String brand, color;
	protected int wheels;
	
	public Vehicle1(){
	}

	public Vehicle1(String brand, String color, int wheels) {
		super();
		this.brand = brand;
		this.color = color;
		this.wheels = wheels;
	}
	
}

class Car1 extends Vehicle1{

	public Car1(String brand, String color, int wheels) {
		super(brand, color, wheels);
		// TODO Auto-generated constructor stub
		System.out.println("Car      "+this.brand+"      "+this.color+"            "+this.wheels);
	}
	
}

class Truck1 extends Vehicle1{

	public Truck1(String brand, String color, int wheels) {
		super(brand, color, wheels);
		// TODO Auto-generated constructor stub
		System.out.println("Truck    "+this.brand+"      "+this.color+"         "+this.wheels);
	}
	
}

class Bus1 extends Vehicle1{

	public Bus1(String brand, String color, int wheels) {
		super(brand, color, wheels);
		// TODO Auto-generated constructor stub
		System.out.println("Bus      "+this.brand+"        "+this.color+"          "+this.wheels);
	}
	
}