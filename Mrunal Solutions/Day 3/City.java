//The program contains a class Vehicle2 which is extended by other 3 classes i.e Bus2,Truck2,Car2;
//In City class objects of Car2,Bus2, Truck2 invoke display method tp print their properties value.

package com.hsbc.day3;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c = new Car2("Maruti", "Red", 4);
		Bus2 b = new Bus2("Tata", "Black", 6);
		Truck2 t = new Truck2("Hundai", "Yellow", 8);
		
		c.display("Car");
		b.display("Bus"); 
		t.display("Truck");
	}

}
class Vehicle2{
	
	protected String brand, color;
	protected int wheels;
	
	public Vehicle2(){
	}

	public Vehicle2(String brand, String color, int wheels) {
		super();
		this.brand = brand;
		this.color = color;
		this.wheels = wheels;
	}
	
	protected void display(String str){
		System.out.println(str+" Brand is "+this.brand+", Color is "+this.color+", an has "+this.wheels+" Wheels.");
	}
	
}

class Car2 extends Vehicle2{

	public Car2(String brand, String color, int wheels) {
		super(brand, color, wheels);
		// TODO Auto-generated constructor stub
	//	System.out.println("Car      "+this.brand+"      "+this.color+"            "+this.wheels);
	}
	
}

class Truck2 extends Vehicle2{

	public Truck2(String brand, String color, int wheels) {
		super(brand, color, wheels);
		// TODO Auto-generated constructor stub
		//System.out.println("Truck    "+this.brand+"      "+this.color+"         "+this.wheels);
	}
	
}

class Bus2 extends Vehicle2{

	public Bus2(String brand, String color, int wheels) {
		super(brand, color, wheels);
		// TODO Auto-generated constructor stub
		//System.out.println("Bus      "+this.brand+"        "+this.color+"          "+this.wheels);
	}
	
}