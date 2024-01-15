import java.util.Scanner;
public class Sum{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int userInput = 0;
	int largest = Integer.MIN_VALUE ;

	System.out.print("Enter number: ");
	userInput = input.nextInt();
	if(userInput > largest)largest= userInput;

	System.out.print("Enter number: ");
	userInput = input.nextInt();
	if(userInput > largest)largest = userInput ;

	System.out.print("Enter number: ");
	userInput = input.nextInt();
	if(userInput > largest)largest = userInput;

	System.out.printf("%d is the largest",largest);








}



}