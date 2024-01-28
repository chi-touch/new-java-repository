import java.util.Scanner;
public class MonthYear{

public static void main(String[]args){
Scanner userinput = new Scanner(System.in);
	
System.out.print("Enter month number: ");
int month = userinput.nextInt();

System.out.print("Enter year number: ");
int year = userinput.nextInt();

if(month == 1){
	System.out.println("January " + year + " has 31 days");
}

if(month == 2 && year%4 == 0){
	System.out.println("February " + year + " has 29 days as leap year");

}
else{
	System.out.println("February " + year + " has 28 days");
}

if(month == 3){
System.out.println("March " + year + " has 31 days");

}
  
if(month == 4){
System.out.println("April" + year + " has 30 days");

}

if(month == 5){
System.out.println("May " + year + " has 31 days");

}

if(month == 6){
System.out.println("June " + year + " has 30 days");

}

if(month == 7){
System.out.println("July" + year + " has 31 days");

}

if(month == 8){
System.out.println("August " + year + " has 31 days");

}

if(month == 9){
System.out.println("September " + year + " has 30 days");

}

if(month == 10){
System.out.println("October " + year + " has 31 days");

}

if(month == 11){
System.out.println("November " + year + " has 30 days");

}

if(month == 12){
System.out.println("December " + year + " has 31 days");

}

}
}