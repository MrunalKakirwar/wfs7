//The program contains an Interface Shape3D1 which is implemented by Sphere1 and Cube1 class.
//Shape3D1 has two methods which computes volume and surface area.
//Both the class Sphere1 and cube1 overrides the method according to there formula.

package com.hsbc.day3;

public class Compute2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere1 s = new Sphere1();
		s.vol(5);
		s.surfaceArea(5);
		
		Cube1 c = new Cube1();
		c.vol(6);
		c.surfaceArea(6);
	}

}

interface  Shape3D1{
	 public void vol(int r);
	  public void surfaceArea(int r);
}

class Sphere1 implements Shape3D1{

	@Override
	
	public void vol(int r) {
		// TODO Auto-generated method stub
		System.out.println("Interface --> Volume of Sphere is "+ ((4/3)*3.14*r*r*r));
		
	}

	@Override
	public void surfaceArea(int r) {
		// TODO Auto-generated method stub
		System.out.println("Interface --> SurfaceArea of Sphere is "+ (4*3.14*r*r));
	}
	
}

class Cube1 implements Shape3D1{

	@Override
	public void vol(int r) {
		// TODO Auto-generated method stub
		System.out.println("Interface --> Volume of Cube is "+ (r*r*r));
		
	}

	@Override
	public void surfaceArea(int r) {
		// TODO Auto-generated method stub
		System.out.println("Interface --> SurfaceArea of Cube is "+ (6*r*r));
	}
	
}