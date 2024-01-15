import java.util.Scanner;
public class Largests{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number:");
	int first = input.nextInt();

	System.out.print("Enter second number:");
	int second = input.nextInt();

	System.out.print("Enter third number:");
	int third = input.nextInt();

	if(first > second && first > third)
		System.out.printf("%d is the largest",first);

	if(second > first && second > third)
		System.out.printf("%d is the largest",second);

	if(third > first && third > second)
		System.out.printf("%d is the largest",third);
}
}


	