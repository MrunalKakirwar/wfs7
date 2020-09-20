//Program to calculation Addition, Subtraction, Multiplication, Division of tow different types of numbers by
// creation a object of class Calculator.
//This Program is an example of Function Overloading concept

package com.hsbc.day2;

public class Calculator1 {

	void add(int a, int b){
		System.out.println("Additon of two int nos is :" + a+b);
	}
	void mul(int a, int b){
		System.out.println("Multiplication of two int nos is :" + a*b);
	}
	void sub(int a, int b){
		System.out.println("Subtraction of two int nos is :" + (a-b));
	}
	void div(int a, int b){
		System.out.println("Division of two int nos is :" + a/b);
	}

	
	void add(double a, double b){
		System.out.println("Additon of two double nos is :" + a+b);
	}
	void mul(double a, double b){
		System.out.println("Multiplication of two double nos is :" + a*b);
	}
	void sub(double a, double b){
		System.out.println("Subtraction of two double nos is :" + (a-b));
	}
	void div(double a, double b){
		System.out.println("Division of two double nos is :" + a/b);
	}
	
	
	void add(int a, double b){
		System.out.println("Additon of one int and other double nos is :" + a+b);
	}
	void mul(int a, double b){
		System.out.println("Multiplication of one int and other double nos is :" + a*b);
	}
	void sub(int a, double b){
		System.out.println("Subtraction of one int and other double nos is :" + (a-b));
	}
	void div(int a, double b){
		System.out.println("Division of one int and other double nos is :" + a/b);
	}
	
	void add(double a, int b){
		System.out.println("Additon of one double and other int nos is :" + a+b);
	}
	void mul(double a, int b){
		System.out.println("Multiplication of one double and other int nos is :" + a*b);
	}
	void sub(double a, int b){
		System.out.println("Subtraction of one double and other int nos is :" + (a-b));
	}
	void div(double a, int b){
		System.out.println("division of one double and other int nos is :" + a/b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator1 obj = new Calculator1();
		
		obj.add(10, 5);
		obj.add(1000000.4363457, 50);
		obj.add(300000.6788888888888888, 40000000008.7658758587);
		obj.add(50,1000000.4363457);
		
		System.out.println("");
		
		obj.mul(10, 5);
		obj.mul(1000000.4363457, 50);
		obj.mul(300000.6788888888888888, 40000000008.7658758587);
		obj.mul(50,1000000.4363457);
		
		System.out.println("");
		
		obj.sub(10, 5);
		obj.sub(1000000.4363457, 50);
		obj.sub(300000.6788888888888888, 40000000008.7658758587);
		obj.sub(50,1000000.4363457);
		
		System.out.println("");
		
		obj.div(10, 5);
		obj.div(1000000.4363457, 50);
		obj.div(300000.6788888888888888, 40000000008.7658758587);
		obj.div(50,1000000.4363457);
	}

}
