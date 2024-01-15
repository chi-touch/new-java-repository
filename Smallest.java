import java.util.Scanner;
public class Smallest{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number:");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number:");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number:");
	int thirdNumber = input.nextInt();


	int sum = firstNumber+ secondNumber+ thirdNumber;
	double average = sum/3;
	int product = firstNumber* secondNumber* thirdNumber;

	System.out.println("the sum is:"+ sum);
	System.out.println("the average is:"+ average);
	System.out.println("the product is:"+ product);


	if(firstNumber> secondNumber&& firstNumber> thirdNumber)
		System.out.printf("%d is the largest%n",firstNumber);

	if(secondNumber> firstNumber&& secondNumber> thirdNumber)
		System.out.printf("%d is the largest%n",secondNumber);

	if(thirdNumber> firstNumber&& thirdNumber> secondNumber)
		System.out.printf("%d is the largest%n", thirdNumber);

	if(firstNumber< secondNumber&& firstNumber< thirdNumber)
		System.out.printf("%d is the smallest%n",firstNumber);

	if(secondNumber< firstNumber&& secondNumber< thirdNumber)
		System.out.printf("%d is the smallest%n",secondNumber);

	if(thirdNumber< firstNumber&& thirdNumber< secondNumber)
		System.out.printf("%d%nis the smallest%n",thirdNumber);







}



}