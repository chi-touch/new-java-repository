import java.util.Scanner;
public class TaxCalculator{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	double taxRate = 0;
	double balanceOfEarning =0;
	double taxBalance = 0;
	double balance = 0;
	double tax = 0;
	double earning = 0;
	double totalTax = 0;

	
	for(int count = 0; count < 3; count ++){
	System.out.print("Enter your name: ");
	String name1 = input.next();

	System.out.print("Enter your earning: ");
	earning = input.nextInt();


	if(earning <= 30000 ||earning > 30000){
	taxRate = (earning * 15)/100;
	tax = taxRate;
	}
		

	if(earning > 30000){
	balanceOfEarning = earning - 30000;
	taxBalance =(30000 *15)/100;
	balance = (balanceOfEarning * 20)/100;
	tax =  taxBalance  + balance;
	}



	totalTax = tax + totalTax;
		
	
	System.out.printf("%.2f is the citizen's tax%n",tax);
}
	System.out.printf("%.2f is the citizen's totalTax%n",totalTax );


}




}