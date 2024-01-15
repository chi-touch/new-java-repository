import java.util.Scanner;
public class Product{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int sum = 0;
	int count;
	double average = 0;
	int number;

	System.out.println("Enter numbers: ");
	count = input.nextInt();

	for(int i = 0; i < count; i++){

		number = input.nextInt();

		sum = sum + number;
	}
	average = sum/count;
	System.out.printf("%d sum is %n:", sum);
	System.out.printf("average is %f:", average);

	
}
}