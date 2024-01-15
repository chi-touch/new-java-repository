import java.util.Scanner;
public class Largeststt{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int largest = 0;
	int userInput =0;
	for(int count = 0;count < 10;count++){
	System.out.print("Enter number:");
	userInput = input.nextInt();
	if(userInput > largest)  largest = userInput;
	

}
	System.out.printf("%d is the largest",largest);




}

}