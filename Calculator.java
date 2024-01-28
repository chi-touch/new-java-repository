import java.util.Scanner;
public class Calculator{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("1-> Additon \n"+"2 -> Subtration \n"+"3 -> Division \n"+"4-> Multiplication \n");

	int calculatorOption = input.nextInt();

	switch(calculatorOption){

	case 1: System.out.print("welcome to addition");
		System.out.print("enter first number");
		int number1 = input.nextInt();	

		System.out.print("enter second number");
		int number2 = input.nextInt();
			int result = number1 + number2;
		System.out.print("Answer is:" + result);		
	


}

}


	


}