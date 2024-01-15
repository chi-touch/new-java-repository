import java.util.Scanner;
public class FindTheLargestNumber1 {

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int number = 0;
	int largest = Integer.MIN_VALUE;

	for(int counter = 0;counter <= 10; counter++){
	System.out.print("Enter number:");
		number = input.nextInt();
	if(number > largest)largest = number;

}
	System.out.printf("The winner of the sales contest is %d",largest);


}



}