import java.util.Scanner;
public class ModifiedAccountClassTest{

	public static void main(String [] args){

	ModifiedAccountClass myAccount1 = new ModifiedAccountClass("Jane Green", 50.00);
	ModifiedAccountClass myAccount2 = new ModifiedAccountClass("John Blue", -7.53);


	System.out.printf("%s balance: $%.2f%n",myAccount1.getName(),myAccount1.getBalance());
	System.out.printf("%s balance: $%.2f%n",myAccount2.getName(),myAccount2.getBalance());

	Scanner input = new Scanner(System.in);

	System.out.print("Enter deposit amount for myAccount1:");
	double depositAmount = input.nextDouble();
	System.out.printf("%nadding %.2f to myAccount1 balance%n%n",depositAmount);
	myAccount1.deposit(depositAmount);

	System.out.println("Please don't withdraw what is morethan your balance:");
	double withdraws = input.nextDouble();
	myAccount1.withdraws(withdraws);
	
	
	System.out.printf("%s balance: $%.2f%n",myAccount1.getName(),myAccount1.getBalance());
	System.out.printf("%s balance: $%.2f%n%n",myAccount2.getName(),myAccount2.getBalance());
	System.out.print("Withdrawal amount exceeded account balance");

	System.out.println("Enter deposit amount for myAccount2:");
	depositAmount = input.nextDouble();
	myAccount2.deposit(depositAmount);

	System.out.println("Please don't withdraw what is morethan your balance:");
	withdraws = input.nextDouble();
	myAccount2.withdraws(withdraws);
	
	
	


	System.out.printf("%s balance: $%.2f%n",myAccount1.getName(),myAccount1.getBalance());
	System.out.printf("%s balance: $%.2f%n%n",myAccount2.getName(),myAccount2.getBalance());
	System.out.print("Withdrawal amount exceeded account balance");


   	}
}