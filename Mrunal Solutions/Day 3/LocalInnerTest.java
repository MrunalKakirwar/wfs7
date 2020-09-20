//Program having a class called BankAccount with deposit (), withdraw () and getBalance () methods.
//A local inner class is created inside the getBalance() method called InterestAdder and implement 
//the interest calculations and add the interest to the current balance


package com.hsbc.day3;

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc ba = new BankAcc();
		
		ba.deposit(45900);
		ba.withdraw(1234);
		ba.getBalance();
	}

}

class BankAcc{
 	private String accountNum; // the account number
    private double balance; // the amount on deposit
	
    public BankAcc(){
    	super();
    }
    
    public BankAcc(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}
    
    public void deposit(double amount)	// note "mutator" method
    {
        double newBalance = this.balance + amount;
        this.balance = newBalance;				// modifies instance var	
        System.out.println("New Balance after Deposit is "+ this.balance);
    }

    public void withdraw(double amount)	// note "mutator" method
    {
        double newBalance = this.balance - amount;
        this.balance = newBalance;			// modifies instance var
        System.out.println("New Balance after Withdraw is "+ this.balance);
    }
    
    public void getBalance()	// note "accessor" method
    {
    	class InterestAdder {
    		
	    	double interestCal(){
	    		   		return (balance*12)/12;
	    	 }
	    }
    	InterestAdder ia = new InterestAdder();
    	System.out.println("Updated Balance after adding the Interest is "+ (this.balance+ia.interestCal()) );
    }
    
}
