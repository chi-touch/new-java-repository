import java.util.Scanner;
public class Average{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number from 1-10:");
	int number = input.nextInt();

	int sum = 0;
	int count = 0;
	for(; count <number;){
	System.out.print("Enter number:");
	sum = input.nextInt()+ sum;
	count++;
	}
	
	//while(count <3){
	//System.out.print("Enter number :");
	//sum = input.nextInt()+ sum;
	//count++;
	
	//}
	double average = (sum+0.0) / count;

	System.out.printf("the sum is %d%n", sum);
	System.out.printf("the average is %.2f", average);






}







}