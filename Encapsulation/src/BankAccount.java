
 class BankAccount {
	 private long accountNumber;
     private double accountBalance;
    public static String bankName;
    
    // Constructor for creating account and assigning initial bank balance directly through object
    public BankAccount(double amount) {
    	accountBalance = amount;
    	System.out.println("Account is created");
    }
    
    public double checkBalance() {
    	return this.accountBalance;
    }
    
    public void deposit(double amount) {
    	accountBalance += amount;
    	System.out.println("amount " + amount + " is credited on your account");
    }
    
    public void withdraw(double amount) {
    	accountBalance -= amount;
    	System.out.println("amount "+amount+ " is debited from your account");
    }
    
    
    
}
