import java.util.Scanner;
public class ArithmeticSmallestLargest{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number:");
	int numb1 = input.nextInt();

	System.out.print("Enter second number:");
	int numb2 = input.nextInt();

	System.out.print("Enter third number:");
	int numb3 = input.nextInt();


	int sum = numb1 + numb2 + numb3;
	double average = sum/3;
	int product = numb1 * numb2 * numb3;

	System.out.printf("%d is the sum%n", sum);
	System.out.printf("%.2f is the average%n", average);
	System.out.printf("%d is the product%n", product);

	if(numb1 < numb2 && numb1 < numb3)
		System.out.printf("%d is the smallest%n", numb1);

	if(numb2 < numb1 && numb2 < numb3)
		System.out.printf("%d is the smallest%n", numb2);

	if(numb3 < numb1 && numb3 < numb2)
		System.out.printf("%d is the smallest%n", numb3);

	if(numb1 > numb2 && numb1 > numb3)
		System.out.printf("%d is the largest%n", numb1);

	if(numb2 > numb1 && numb2 > numb3)
		System.out.printf("%d is the largest%n", numb2);

	if(numb3 > numb1 && numb3 > numb2)
		System.out.printf("%d is the largest%n", numb3);






}









}