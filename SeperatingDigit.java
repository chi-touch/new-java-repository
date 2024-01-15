import java.util.Scanner;
public class SeperatingDigit{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number:");
	int varible = input.nextInt();

	int firstDigit = varible/ 10000;
	int secondDigit = varible/1000%10;
	int thirdDigit = varible/100%10;
	int forthDigit = varible /10%10;
	int lastDigit = varible% 10;


	System.out.printf("%d %d %d %d %d %n", firstDigit,secondDigit,thirdDigit,forthDigit,lastDigit);


}


}