import java.util.Scanner;
public class Largestsst{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int smallest = Integer.MAX_VALUE;
	//int largest = Integer.MIN_VALUE;
	int userInput = 0;

	System.out.print("Enter number:");
	userInput = input.nextInt();
	if(userInput < smallest)  smallest = userInput;

	System.out.print("Enter number");
	userInput = input.nextInt();
	if(userInput < smallest) smallest = userInput;

	System.out.print("Enter number");
	userInput = input.nextInt();
	if(userInput < smallest) smallest = userInput;

	System.out.print("Enter number:");
	userInput = input.nextInt();
	if(userInput < smallest)  smallest = userInput;

	System.out.print("Enter number");
	userInput = input.nextInt();
	if(userInput < smallest) smallest = userInput ;

	System.out.print("Enter number");
	userInput = input.nextInt();
	if(userInput < smallest) smallest = userInput ;

	System.out.print("Enter number:");
	userInput = input.nextInt();
	if(userInput < smallest) smallest = userInput ;

	System.out.print("Enter number");
	userInput = input.nextInt();
	if(userInput < smallest) smallest = userInput;
	System.out.print("Enter number");
	userInput = input.nextInt();
	if(userInput < smallest) smallest = userInput ;

	System.out.print("Enter number");
	userInput = input.nextInt();
	if(userInput < smallest) smallest = userInput ;

	System.out.printf("%d is the smallest",smallest);



}

}