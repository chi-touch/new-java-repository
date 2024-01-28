import java.util.Scanner;
public class CarPropertiesTest{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	CarProperties car1 = new CarProperties();

	CarProperties car2  = new CarProperties();


	System.out.print("Enter the car model:");
	String model = input.nextLine();

	System.out.print("Enter the year of the car :");
	String year = input.nextLine();

	System.out.print("Enter the price of the car :");
	double price = input.nextDouble();

	System.out.print("Enter the car model:");
	String model1 = input.next();

	System.out.print("Enter the year of the car :");
	String year1 = input.next();

	System.out.print("Enter the price of the car :");
	double price1 = input.nextDouble();


	car1.setModel(model);
	car1.setYear(year);
	car1.setPrice(price);

	

	car2.setModel(model1);
	car2.setYear(year1);
	car2.setPrice(price1);

	



	System.out.printf("%s %s %.2f%n %s %s %.2f",car1.getModel(),car1.getYear(),car1.getPrice(),car2.getModel(),car2.getYear(),car2.getPrice());
		

	System.out.println();

	double discount1 = price * 0.05;
	car1.setPrice(discount1);

	double discount2 = price * 0.07;
	car2.setPrice(discount2);

	System.out.printf("%.2f%n %.2f%n",car1.getPrice(),car2.getPrice());

	System.out.println();


	double newCarPrice1 = price - discount1;
	car1.setPrice(newCarPrice1);

	double newCarPrice2 = price1 - discount2;
	car2.setPrice(newCarPrice2);	

	System.out.printf("""

		The new car price for the first car is: %.2f%n
		The new car price for the second car is: %.2f%n
		""",car1.getPrice(),car2.getPrice());

}


}