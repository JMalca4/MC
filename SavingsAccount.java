

 
public class SavingsAccount extends BankAccount{ //Savings Account class that represents the customers Savings account
	private final double rate = 0.025;
	private static int savingsNumber = 0;
	private String accountNumber;
	
	
	public SavingsAccount(String name, double amount) // Savings Account constructor
	{
		super(name, amount);
		accountNumber = "100002";
		
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) 
	{
		super(oldAccount, amount);
		savingsNumber += 1;
		this.accountNumber = oldAccount.accountNumber;
	}
	
	
	public void postInterest() 
	{
		//monthly rate
		double monthlyRate = (rate / 12);
		
		//monthly fees
		double monthlyInterest = monthlyRate * getBalance();
		
		//deposit
		deposit(monthlyInterest);
	}
	
	@Override
	public String getAccountNumber() 
	{
		
		return accountNumber + "-" + savingsNumber;
	}
	
	
}