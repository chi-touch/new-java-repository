import java.util.Scanner;
public class FindTheTwoLargestNumbers{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int firstLargest = Integer.MIN_VALUE;
	int secondLargest = Integer.MAX_VALUE;
	int number = 0;

	for(int counter = 0; counter <= 10; counter ++){
	System.out.print("Enter number:");
	number = input.nextInt();

	if(number > firstLargest)firstLargest= number;
	if(firstLargest< secondLargest)secondLargest= firstLargest;
}

	System.out.printf("%d is the firstLargest%n",firstLargest);

	System.out.printf("%d is the secondLargest ",secondLargest );

}










}