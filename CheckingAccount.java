public class CheckingAccount extends BankAccount{ //Checking Account class that represents the customers checking account
	
	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) { //Checking account constructor
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		double amountAfterFees = (amount + FEE);
		return super.withdraw(amountAfterFees);
	}
}