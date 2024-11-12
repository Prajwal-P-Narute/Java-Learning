
 class BankMain {
	 public static void main(String[] args) {
		 
		 BankAccount account = new BankAccount(2000.00);
		 
		 System.out.println("your account Balance is "+ account.checkBalance());
		 
		 account.deposit(7000);
		 System.out.println("your account Balance is "+ account.checkBalance());
		 account.withdraw(2000);
		 
		 System.out.println("your account Balance is "+ account.checkBalance());
		 
		 
	 }

}
