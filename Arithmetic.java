import java.util.Scanner;
public class Arithmetic{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first number: ");
	int numb1 = input.nextInt();

	System.out.print("Enter the second number: ");
	int numb2 = input.nextInt();

	int square1 = numb1 * numb1;
	int square2 = numb2 * numb2;

	int sum = square1 + square2;
	int difference = square1 - square2;

	
	System.out.printf("%d is square1%n", square1);
	System.out.printf("%d is square2%n", square2);
	System.out.printf("%d is the sum%n", sum);
	System.out.printf("%d is the difference", difference);






}





} 