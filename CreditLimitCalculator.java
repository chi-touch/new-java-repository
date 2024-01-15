import java.util.Scanner;
public class CreditLimitCalculator{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your account number: ");
	int accountNumber = input.nextInt();

	System.out.print("Enter  balance at the beginning of the month: ");
	int beginningBalance = input.nextInt();

	System.out.print("Enter total of all items charged by the customer this month: ");
	int charges= input.nextInt();

	System.out.print("Enter allowed credit limit: ");
	int allowedCredit = input.nextInt();


	int newBalance = beginningBalance  + charges - allowedCredit;
	
	System.out.printf("%d is the new balance", newBalance);

	if(newBalance > allowedCredit)
		System.out.print("Credit limit exceeded");


//int salespersonPayment = 0;
//int itemSold = 0;

//while(itemSold > salespersonPayment ){
//	itemSold++;
//}




}





}