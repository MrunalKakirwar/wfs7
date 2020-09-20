//There is a package called shapes. There are some classes in the package representing some
//common geometric shapes like Square, Triangle, Circle and so on.  
//TestShapes is a class which creates objects for all the shapes and prints corresponding results.
  

package com.hsbc.shapes;

import java.util.Scanner;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the side of square : "); 
	     int s = sc.nextInt();
	     Square sobj = new Square(s);
	     System.out.println("Area of Square is : "+sobj.area());
	     System.out.println("Perimeter of Square is : "+sobj.perimeter());
	     
	     System.out.println("Enter the radius of circle : "); 
	     int r = sc.nextInt();
	     Circle cobj = new Circle(r);
	     System.out.println("Area of Circle is : "+cobj.area());
	     System.out.println("Perimeter of Circle is : "+cobj.perimeter());
	     
	     System.out.println("Enter the sides of triangle : "); 
	     int s1 = sc.nextInt();
	     int s2 = sc.nextInt();
	     int s3 = sc.nextInt();
	     Triangle tobj = new Triangle(s1,s2,s3);
	   //  System.out.println("Area of Circle is : "+cobj.area());
	     System.out.println("Perimeter of Triangle is : "+tobj.perimeter());
	     
	
	}

}
