import java.util.Scanner;
public class LargestSmallest{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number:");
	int numb1 = input.nextInt();

	System.out.print("Enter second number:");
	int numb2 = input.nextInt();

	System.out.print("Enter third number:");
	int numb3 = input.nextInt();

	System.out.print("Enter forth number:");
	int numb4 = input.nextInt();

	System.out.print("Enter fifth number:");
	int numb5 = input.nextInt();

	if(numb1 > numb2 && numb1 > numb3 && numb1 > numb4 && numb1 > numb5)
		System.out.printf("%d is the largest%n", numb1);

	if(numb2 > numb1 && numb2 > numb3 && numb2 > numb4 && numb2 > numb5)
		System.out.printf("%d is the largest%n", numb2);

	if(numb3 > numb2 && numb3 > numb1 && numb3 > numb4 && numb3 > numb5)
		System.out.printf("%d is the largest%n", numb3);

		
	if(numb4 > numb2 && numb4 > numb3 && numb4 > numb1 && numb4 > numb5)
		System.out.printf("%d is the largest%n", numb4);

	if(numb5 > numb2 && numb5 > numb3 && numb5 > numb4 && numb5 > numb1)
		System.out.printf("%d is the largest%n", numb5);

	if(numb1 < numb2 && numb1 < numb3 && numb1 < numb4 && numb1 < numb5)
		System.out.printf("%d is the smallest%n", numb1);

	if(numb2 < numb1 && numb2 < numb3 && numb2 < numb4 && numb2 < numb5)
		System.out.printf("%d is the smallest%n", numb2);

	if(numb3 < numb2 && numb3 < numb1 && numb3 < numb4 && numb3 < numb5)
		System.out.printf("%d is the smallest%n", numb3);

	if(numb4 < numb2 && numb4 < numb3 && numb4 < numb1 && numb4 < numb5)
		System.out.printf("%d is the smallest%n", numb4);

	if(numb5 < numb2 && numb5 < numb3 && numb5 < numb4 && numb5 < numb1)
		System.out.printf("%d is the smallest%n", numb5);

}


}