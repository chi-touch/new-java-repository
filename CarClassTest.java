import java.util.Scanner;
public class CarClassTest{

	public static void main (String [] args){
	Scanner userInput = new Scanner(System.in);
	CarClass myCarClass= new CarClass();

	System.out.printf("the name is %s%n%n", myCarClass.getModel());
	System.out.println("Enter model: ");

	String theModel = input.nextLine();
	myCarClass.setModel(theModel);
	System.out.println();

	System.out.printf("Model in object myCarClass is: %n%s%n", myCarClass.getModel());
	
	System.out.printf("the year is %s%n%n", myCarClass.getYear());
	System.out.println("Enter year: ");

	String theYear = input.nextLine();
	myCarClass.setYear(theYear);
	System.out.println();

	System.out.printf("Year in object myCarClass is: %n%s%n", myCarClass.getYear());

	System.out.printf("the price is %s%n%n", myCarClass.getPrice());
	System.out.println("Enter price: ");

	double thePrice = input.nextDouble();
	myCarClass.setPrice(thePrice);
	System.out.println();

	System.out.printf("Price in object myCarClass is: %n%s%n", myCarClass.getPrice());



}



}