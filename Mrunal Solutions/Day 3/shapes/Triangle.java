//There is a package called shapes. There are some classes in the package representing some
//common geometric shapes like Square, Triangle, Circle and so on. 
//This is class Triangle which calculates area and perimeter.
package com.hsbc.shapes;

public class Triangle {
		private int s1, s2, s3;

		public Triangle(int s1, int s2, int s3) {
			super();
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
		}
		 public int perimeter(){
			 return s1+s2+s3;
		 }
		 
}
