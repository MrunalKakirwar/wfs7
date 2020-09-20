//This program contains a class Worker which computes the weekly salary of two types of workers.
//One is SalariedWorker who gets salary on the basis of no. of hours worked.
//Other is Daily worker who gets salary on the basis of no. of Days worked.
package com.hsbc.day3;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyWorker dw = new DailyWorker("Mrunu", 1000);
		SalariedWorker sw = new SalariedWorker("Kuhu",50);
		
		dw.pay(5);
		sw.pay();
	}

}
 class Worker{
	 private String name;
	 private int salaryrate;
	 
	 
	 public Worker() {
		super();
	}


	public Worker(String name, int salaryrate) {
		super();
		this.name = name;
		this.salaryrate = salaryrate;
	}


	protected void pay(){
		 System.out.println("Salary of SalariedWorker "+this.name+" is : "+ this.salaryrate*40);
	 }
	
	protected void pay(int days){
		 System.out.println("Salary of DailyWorker "+this.name+" is : "+ this.salaryrate*days);
	 }
	
 }
 
  class DailyWorker extends Worker{

	public DailyWorker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DailyWorker(String name, int salaryrate) {
		super(name, salaryrate);
		// TODO Auto-generated constructor stub
	}
	
 }
 
 class SalariedWorker extends Worker{

	public SalariedWorker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedWorker(String name, int salaryrate) {
		super(name, salaryrate);
		// TODO Auto-generated constructor stub
	}
	 
 }