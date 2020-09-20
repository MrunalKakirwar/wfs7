//Program having a class called BankAccount with deposit (), withdraw () and getBalance () methods.
//An anonymous inner class is created in the getBalance() method to do the interest calculations 
//and add the interest to the current balance


package com.hsbc.day3;

public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc ba = new BankAcc();
		
		ba.deposit(45900);
		ba.withdraw(1234);
		ba.getBalance();
	}

}

interface InterestAdder{
	public double interestCal();
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
    	
    	InterestAdder ia = new InterestAdder(){
    		public double interestCal(){
		   		return (balance*12)/12;
	 }
    	};
    	
    	System.out.println("Updated Balance after adding the Interest is "+ (this.balance+ia.interestCal()) );
    }
}