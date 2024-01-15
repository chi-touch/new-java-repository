import java.util.Scanner;
public class Multiples{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("enter second number: ");
	int secondNumber = input.nextInt();

	int firstNumberTrippled = firstNumber * 3;
	int secondNumberDoubled = secondNumber * 2;

	if(firstNumberTrippled % secondNumberDoubled ==0){
		System.out.printf("%d trippled is a multiple of %d doubled",firstNumber, secondNumber);
}
	else{
		System.out.printf("%d is not tripled", firstNumber);

}

}







}