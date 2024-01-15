import java.util.Scanner;

public class Prac{

public static  void main(String... args){

Scanner input = new Scanner(System.in);

int[][] personality = new int [4][2];

personality[0][0] = 0;
personality[0][1] = 0;
String answer;

answer = input.nextLine();

if (answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B")){
	if(answer.equalsIgnoreCase("A")){
		personality[0][0]++;
	} else {
		personality[0][1]++;
	}

} else{
	System.out.print("Enter the correct answer");
}

if (personality[0][0] < personality[0][1]){
	System.out.print("Hello");
}

}
}