package lab4_nandini;

public class CurrentAccount extends Account {
        
	private double overdraftLimit;
	
	public CurrentAccount() {
		super();
	}
	
	public CurrentAccount(long accNum,double balance) {
		super(accNum,balance);
	}
	
	
//	annotation to override the withdraw method of Account Class
	@Override
	public void withdraw(double withdrawCash) {
		
		super.withDraw(withdrawCash);
		
		if((super.getBalance() +withdrawCash) > overdraftLimit) {
			System.out.println("OverdraftLimit Exceeded!");
		}
		else {
			System.out.println("OverdraftLimit has not Exceeded!");
		}		
		
		
		
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
}
