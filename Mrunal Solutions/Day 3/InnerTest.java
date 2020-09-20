//Program having a class called BankAccount with deposit (), withdraw () and getBalance () methods.
//An inner class called InterestAdder is created and implement the interest calculations and add 
//the interest to the current balance.


package com.hsbc.day3;

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc ba = new BankAcc("SD1232",5660);
		//ba.inner.interestCal();
		ba.getBalance();
		ba.deposit(45900);
		ba.withdraw(1234);
		BankAcc.InterestAdder in = ba.new InterestAdder();
		//ba.new InterestAdder().interestCal();
		in.interestCal();
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
	        double newBalance = balance + amount;
	        balance = newBalance;				// modifies instance var	
	        System.out.println("New Balance after Deposit is "+ this.balance);
	    }

	    public void withdraw(double amount)	// note "mutator" method
	    {
	        double newBalance = balance - amount;
	        balance = newBalance;			// modifies instance var
	        System.out.println("New Balance after Withdraw is "+ this.balance);
	    }
	    
	    public void getBalance()	// note "accessor" method
	    {
	        
	        // returns value of instance var
	        System.out.println("Current Balance is "+ this.balance);
	    }
	    
	  //  InterestAdder inner = new InterestAdder();
	    
	    class InterestAdder {
	    	void interestCal(){	    		
	    		System.out.println("Iterest is :"+ (outer.balance*12)/12 );
	    	 }
	    }
 }*/