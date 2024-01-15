import java.util.Scanner;
public class Divisible{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number:");
	int numb = input.nextInt();

	if(numb % 3 == 0){
		System.out.printf("%d is divisible", numb);
}
	else{
		System.out.printf("%d is not divisible", numb);

}

}



}

