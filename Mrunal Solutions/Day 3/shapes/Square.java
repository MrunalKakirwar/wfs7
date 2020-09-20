//There is a package called shapes. There are some classes in the package representing some
//common geometric shapes like Square, Triangle, Circle and so on. 
//This is class Square which calculates area and perimeter.
package com.hsbc.shapes;

public class Square {
		private int side;

		public Square(int side) {
			super();
			this.side = side;
		}
		
		public int area(){
			return side*side;
		}
		public int perimeter(){
			return 4*side;
		}
}
