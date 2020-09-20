//This Program contains a class which displays the following about the JVM.
//1.	Version of Java
//2.	Vendor for Java
//3.	Class Path
//4.	Installed home directory
//5.	OS name on which it is installed with version


package com.hsbc.day3;

public class JVMDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Version is: "+System.getProperty("os.version"));
		System.out.println("Running Java vm vendor name is: "+System.getProperty("java.vm.vendor"));
		System.out.println(System.getProperty("user.home")); 
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("os.name"));
	}

}
