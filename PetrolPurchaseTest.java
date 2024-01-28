import java.util.Date;
import java.util.Scanner;
public class PetrolPurchaseTest{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	Date time = new Date();


	
	System.out.println("Enter the location:");
	String location = input.nextLine();

	System.out.println("Enter the petrol type:");
	String petrolType = input.nextLine();

	System.out.println("Enter the quantity you want to buy:");
	int quantity = input.nextInt();

	System.out.println("Enter the price per liter:");
	double pricePerLiter = input.nextDouble();

	System.out.println("Enter discount of customer:");
	double discount = input.nextDouble();



PetrolPurchase myPetrolPurchase = new PetrolPurchase(location, petrolType, quantity, pricePerLiter,discount);

System.out.printf("""
	+++++++++++++++++++++++++++++++++++
	WELCOME TO NONO FUEL STATION:
	
		PURCHASE DETAILS:

		Location: %s
		Petrol Type: %s
		Quantity: %d
		Price per Liter: %.2f
		Discount price: %.2f
		Total Amount: # %.2f
		Time: %s
	+++++++++++++++++++++++++++++++++++
		
			""",myPetrolPurchase.getLocation(),myPetrolPurchase.getPetrolType(),myPetrolPurchase.getQuantity(),myPetrolPurchase.getPricePerLiter(),myPetrolPurchase.getDiscount(),myPetrolPurchase.getPurchaseAmount(),time);


	System.out.println("Enter the amount the customer gave you:");
	double amountPaid = input.nextDouble();


	


		while(amountPaid < myPetrolPurchase.getPurchaseAmount()){
			System.out.println("invalid Amount paid: error message... Amount paid must be greater than Total Amount");
			System.out.println("Enter the amount the customer gave you:");
			amountPaid = input.nextDouble();

}
double balance = amountPaid -  myPetrolPurchase.getPurchaseAmount();
	System.out.printf("""
	+++++++++++++++++++++++++++++++++++
	WELCOME TO NONO FUEL STATION:
	LOCATION: YABA
		PURCHASE DETAILS:

		Location: %s
		Petrol Type: %s
		Quantity: %d
		Price per Liter: %.2f
		Discount price: %.2f
		Total Amount:  %.2f
		Time: %s
		Amount Paid: %.2f
		Customer's Balance: %.2f
	+++++++++++++++++++++++++++++++++++
		
			""",myPetrolPurchase.getLocation(),myPetrolPurchase.getPetrolType(),myPetrolPurchase.getQuantity(),myPetrolPurchase.getPricePerLiter(),myPetrolPurchase.getDiscount(),myPetrolPurchase.getPurchaseAmount(),time,amountPaid,balance);





}


}