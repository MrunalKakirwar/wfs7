//The program contains a class Salaried worker which implements Payable interface,
//computes the Monthly salary of worker.


package com.hsbc.finance;


public class SalariedWorker implements Payable{
	
	String name, month;
	int salaryRate;
	
	public SalariedWorker(){
		super();
	}

	public SalariedWorker(String name, String month, int salaryRate) {
		super();
		this.name = name;
		this.month = month;
		this.salaryRate = salaryRate;
	}

	

	@Override
	public void getPayInfo() {
		// TODO Auto-generated method stub
		if(this.month=="Jan" || this.month=="MAR" || this.month=="MAY" || this.month=="JULY" || this.month=="AUG" || this.month=="OCT" || this.month=="DEC")
			 System.out.println("Salary of SalariedWorker "+this.name+" of this Month is : "+ this.salaryRate*40*5);
			else
				System.out.println("Salary of SalariedWorker "+this.name+" of the Month " +this.month+" is : "+ this.salaryRate*40*4);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedWorker sw = new SalariedWorker("Kuhu","April",50);
		sw.getPayInfo();
	}

}
