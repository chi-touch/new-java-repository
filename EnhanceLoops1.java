import java.util.Scanner;
public class EnhanceLoops1{

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


for(int index = 0; index < numbers.length; index++){
System.out.print(numbers[index]+ " ");
}

System.out.printf("is %d%n ", sum);



// asking the user howmany numbers he wnt to input. giving a particular number but u want to the user to enter lesser number