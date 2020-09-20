//The program contains an abstract class Shape3D which is extended by Sphere and Cube class.
//Shape3D has two methods which computes volume and surface area.
//Both the class Sphere and cube overrides the method according to there formula.
package com.hsbc.day3;

public class Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere s = new Sphere();
		s.vol(5);
		s.surfaceArea(5);
		
		Cube c = new Cube();
		c.vol(6);
		c.surfaceArea(6);
	}

}

abstract  class  Shape3D{
	abstract void vol(int r);
	abstract void surfaceArea(int r);
}

class Sphere extends Shape3D{

	@Override
	void vol(int r) {
		// TODO Auto-generated method stub
		System.out.println("Volume of Sphere is "+ ((4/3)*3.14*r*r*r));
		
	}

	@Override
	void surfaceArea(int r) {
		// TODO Auto-generated method stub
		System.out.println("SurfaceArea of Sphere is "+ (4*3.14*r*r));
	}
	
}

class Cube extends Shape3D{

	@Override
	void vol(int r) {
		// TODO Auto-generated method stub
		System.out.println("Volume of Cube is "+ (r*r*r));
		
	}

	@Override
	void surfaceArea(int r) {
		// TODO Auto-generated method stub
		System.out.println("SurfaceArea of Cube is "+ (6*r*r));
	}
	
}