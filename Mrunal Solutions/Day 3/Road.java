
//The program contains a class vehicle which is extended by other 3 classes i.e Bus,Truck,Car;

package com.hsbc.day3;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Car("Maruti",4);
		new Truck("Centipede", 345);
		new Bus("Tata","Local Transportation");
		
	}

}

class Vehicle{
	
		protected String brand;
		
	
		public String getBrand() {
			return brand;
		}
	
		public void setBrand(String brand) {
			this.brand = brand;
		}
				
}

class Car extends Vehicle{
	
		private int wheel;
		public Car(String name, int wheel){
			
			this.brand=name;
			this.wheel=wheel;
			System.out.println("This is "+ this.wheel+" Wheeler "+ this.brand+" Car");
		}
	
}

class Truck extends Vehicle{
	
	private int modelNo;
	public Truck(String name, int no){
		
		this.brand=name;
		this.modelNo=no;
		System.out.println("This is "+ this.brand+" Tuck whose ModelNo is "+ this.modelNo);
	}

}

class Bus extends Vehicle{
	
	private String service;
	public Bus(String name, String service){
		
		this.brand=name;
		this.service=service;
		System.out.println("This is "+ this.brand+" Bus used for "+ this.service);
	}

}