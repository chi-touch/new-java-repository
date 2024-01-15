import java.util.Scanner;
public class EnhanceLoop{

	public ststic void main(String [] args){

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
for(intnumber: numbers){
System.out.print(number +",");
}

System.out.printf("is %d%n ", sum);


}




}



}











}