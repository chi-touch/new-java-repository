import java.util.Scanner;
public class IntegersDivisibleBy3{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	
	
	int sum = 0;
	for(int number = 0;number <30;number++){
		if(number % 3 == 0){
			System.out.printf("%d is divisible of the integer%n",number);
				sum = number*5;
			}

		
	}
		System.out.printf("%d is the sum of the integer%n",sum);

}



}