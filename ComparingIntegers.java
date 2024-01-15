import java.util.Scanner;
public class ComparingIntegers{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number:");
	int digit= input.nextInt();

	int square = digit * digit;
	System.out.printf("%d is the square%n", square);

	int number = 100;

	if(digit > number && square > number)
		System.out.printf("%d && %d%n is greaterthan number", digit, square);

	if(digit == number && square == number)
		System.out.printf("%d && %d%n is equal to number", digit, square);

	if(digit != number && square != number)
		System.out.printf("%d && %d%n is not equal to number", digit, square);

	if(digit < number && square < number)
		System.out.printf("%d && %d%n is equal to number", digit, square);






}








}