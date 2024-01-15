import java.util.Scanner;
public class SalesCommissionCalculator{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	for(int count=0;count < 3;count ++){
	System.out.print("Enter worth of merchandise : ");
	int worthOfMerchandise= input.nextInt();

	double commission= (9 * worthOfMerchandise)/100;
	double salespersonEarnings= 200 + commission;
	

	System.out.printf("%.2f is the salesperson earnings%n",salespersonEarnings);
}

}

}