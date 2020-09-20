//Program to calculate the area and perimeter of Square and Rectangle.
//Program contains the class Shape which has methods to calculate area and perimeter. 

package com.hsbc.day2;

public class AreaPeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj = new Shape();
		
		obj.area(10, 5);
		obj.perimeter(10, 5);
		
		System.out.println("");
		
		obj.area(10);
		obj.perimeter(10);
	}

}

class Shape{
	
	void area(int len , int bre){
		System.out.println("Area of Rectangle is :" + len*bre);
	}
	
	void perimeter(int len , int bre){
		System.out.println("Perimeter of Rectangle is :" + 2*(len+bre));
	}
	
	void area(int side){
		System.out.println("Area of Square is :" + side*side);
	}
	
	void perimeter(int side){
		System.out.println("Perimeter of Square is :" + 4*side);
	}
}