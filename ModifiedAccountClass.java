public class ModifiedAccountClass{

	private String name;
	private double balance;


	public ModifiedAccountClass(String name,double balance){
		this.name = name;
	
		if(balance > 0.0){
			this.balance = balance;
		}
	
	}

	
	public void deposit(double depositAmount){
		if(depositAmount > 0.0){
			balance = balance + depositAmount;
	System.out.println("Deposit Successful Here is your new Balance : " + balance);
		} else {
		balance = balance;
	System.out.println("Deposit Failed Here is your old Balance : " + balance);
		}
	}
	public void withdraws(double withdrawAmount){
		if(withdrawAmount > balance ){
		balance = balance;
	System.out.print("Withdrawal amount exceeded account balance");

		}
	else balance = balance - withdrawAmount;

	}

	public double getBalance(){
		return balance;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
	

}