import java.util.Scanner;
public class NegativePositiveZero{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int positiveNumbers = 0;
	int negativeNumbers =0;
	int zeroNumbers =0;

	System.out.print("Enter numberOne:");
	int firstNumber = input.nextInt();

	if(firstNumber> 0)
			positiveNumbers++;
			
	if(firstNumber <= -1)
			negativeNumbers++;	
	
	if(firstNumber == 0)
			zeroNumbers++;


	System.out.print("Enter numberTwo:");
	int secondNumber = input.nextInt();

	if(secondNumber > 0)
			positiveNumbers++;
			
	if(secondNumber <= -1)
			negativeNumbers++;	
	
	if(secondNumber == 0)
			zeroNumbers++;

	System.out.print("Enter numberThree:");
	int thirdNumber = input.nextInt();

	if(thirdNumber  > 0)
			positiveNumbers++;
			
	if(thirdNumber <= -1)
			negativeNumbers++;	
	
	if(thirdNumber == 0)
			zeroNumbers++;

	System.out.print("Enter numberfour:");
	int forthNumber  = input.nextInt();

	if(forthNumber  > 0)
			positiveNumbers++;
			
	if(forthNumber  <= -1)
			negativeNumbers++;	
	
	if(forthNumber  == 0)
			zeroNumbers++;

	System.out.print("Enter numberfive:");
	int fifthNumber  = input.nextInt();

	if(fifthNumber  > 0)
			positiveNumbers++;
			
	if(fifthNumber  <= -1)
			negativeNumbers++;	
	
	if(fifthNumber    == 0)
			zeroNumbers++;


	

	




	System.out.printf("total number of positive is %d%n total number of negative is %d%n total number of zeros is %d",positiveNumbers,negativeNumbers,zeroNumbers);

}






}