import java.util.Scanner;
public class Averag{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	//int largest = 0;
	
	System.out.print("Enter first number:");
	int first = input.nextInt();

	System.out.print("Enter second number:");
	int second = input.nextInt();

	System.out.print("Enter third number:");
	int third = input.nextInt();

	System.out.print("Enter fourth number:");
	int fourth = input.nextInt();

	System.out.print("Enter fifth number:");
	int fifth = input.nextInt();

	int sum = first + second + third + fourth + fifth;
	double average = sum / 5;

	//if(number > number)
	System.out.printf("%d is the sum%n",sum);
	System.out.printf("%.2f is the average",average);

}

}