import java.util.Scanner;
public class Extremes{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int total = 0;
	int counter = 0;
	int maximum = Integer.MIN_VALUE;
	int minimum = Integer.MAX_VALUE;
	int number = 0;
	
	System.out.print("Enter number -1 to quit: ");
	number = input.nextInt();
	
	int sum = maximum + minimum;

	while(number !=-1){
	 	
		counter = counter + 1;

		if(number > maximum)maximum = number;
		if(number < minimum)minimum = number;
		sum = maximum + minimum;

	
		System.out.print("Enter number -1 to quit: ");
		number = input.nextInt();
	}

	System.out.printf("the sum is %d%n",sum);
	System.out.printf("%d is the maximum number%n",maximum);
	System.out.printf("%d is the minimum number",minimum);

	

}

}