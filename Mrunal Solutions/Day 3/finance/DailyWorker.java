//The program contains a class Daily worker which implements Payable interface,
//computes the Monthly salary of worker.

package com.hsbc.finance;

//import com.hsbc.day3.DailyWorker;

public class DailyWorker implements Payable{

	String name, month;
	int salaryRate;
	
	public DailyWorker(){
		super();
	}
	
	public DailyWorker(String name, int salaryRate, String month) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
		this.month= month;
	}

	public void getPayInfo() {
		// TODO Auto-generated method stub
		if(this.month=="Jan" || this.month=="MAR" || this.month=="MAY" || this.month=="JULY" || this.month=="AUG" || this.month=="OCT" || this.month=="DEC")
		 System.out.println("Salary of DailyWorker "+this.name+" of this Month "+this.month +" is : "+ this.salaryRate*31);
		else
			System.out.println("Salary of DailyWorker "+this.name+" of this Month is : "+ this.salaryRate*30);
		
	 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyWorker dw = new DailyWorker("Mrunu", 1000, "DEC");
		dw.getPayInfo();
	}
}
