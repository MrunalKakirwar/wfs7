//There is a package called shapes. There are some classes in the package representing some
//common geometric shapes like Square, Triangle, Circle and so on. 
//This is class Circle which calculates area and perimeter.
package com.hsbc.shapes;

public class Circle {
		private int r;

		public Circle(int r) {
			super();
			this.r = r;
		}
		
		public double area(){
			return (3.14*r*r);
		}
		
		public double perimeter(){
			return (2*3.14*r);
		}
}
