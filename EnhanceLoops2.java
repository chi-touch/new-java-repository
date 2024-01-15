import java.util.Scanner;
public class EnhanceLoops2{

	public static void main(String [] args){

Scanner key = new Scanner(System.in);

int sum = 0;
int count = 0;
System.out.println("How many do u want to enter")
int[] numberOfNumbers = key.nextInt();;

int[] numbers = new int[numberOfNumbers];

while (count < numbers.length){
System.out.println("Enter number");
numbers[count] = key.nextInt();

sum = sum + numbers[count];
count ++;

}
System.out.print("The sum of ");

int numbersIndex = 1;

while (numbersIndex < numbers.length){

sum = sum + numbers[numbersIndex];
numbersIndex+=2;

}


for(int index = 0; index < numbers.length; index++){
System.out.print(numbers[index]+ " ");
}

System.out.printf("is %d%n ", sum);