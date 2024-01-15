import java.util.Scanner;
public class EnhanceLoops{

	public static void main(String [] args){

Scanner key = new Scanner(System.in);

int sum = 0;
int count = 0;
int[] numbers = new int[5];

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





}



}


