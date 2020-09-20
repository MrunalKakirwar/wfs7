//The program contains a class LoadingObject such that the object of that class is created only when 
//the class gets load. 
//Static block is used to load the class



package com.hsbc.day2;

public class LoadingObject {

		static {
			System.out.println("Class Loading!!");
		}
		
		public LoadingObject(String s) {
			// TODO Auto-generated constructor stub
			System.out.println("Name is "+ s);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadingObject obj = new LoadingObject("Mrunu!!!!");
	}

}
