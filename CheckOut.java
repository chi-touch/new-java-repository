import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CheckOut{

	public static void main(String[] args){

	ArrayList<String> item = new ArrayList<String>();
	ArrayList<Integer> items = new ArrayList<Integer>();
	ArrayList<Double> itemsd = new ArrayList<Double>();

	Scanner input = new Scanner(System.in);

	double total = 0;	
	
	
	double discountRate = 0;
	double vat = 0;
	double subTotal= 0;
	
	double discount = 0.0;


	


	
	System.out.println("What is the customer's Name:");
	String name = input.next();


	System.out.println("What did the user buy?");
	String bought = input.next();
	item.add(bought);


	System.out.println("How many pieces?");
	int quantity = input.nextInt();
	items.add(quantity);

	System.out.println("How much per unit?");
	double perUnit = input.nextDouble();
	itemsd.add(perUnit);

	System.out.println("Add more Items?");
	String anwser = input.next();
	

	
	while(anwser.equalsIgnoreCase("yes")){

	
	System.out.println("What did the user buy?");
	bought = input.next();
	item.add(bought);
	
	System.out.println("How many pieces?");
	quantity = input.nextInt();
	items.add(quantity);

	System.out.println("How much per unit?");
	perUnit = input.nextDouble();
	itemsd.add(perUnit);
	System.out.println("Add more Items?");
	anwser = input.next();
	
	System.out.println("How much discount will he get");
	discount =input.nextDouble();

	}
	System.out.println("What is your name?");
	String cashierName = input.next();

	System.out.printf("%n%n");

	System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n Cashier's Name: %s%nCustomer's Name: %s%n%s%n	%s	%s		%s%n",  "SEMICOLON STORES", "MAIN BRANCH", "LOCATION:  312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS",  "TELL: 08103722570",  "Date: 01/Oct/1960 12:00 am", cashierName, name, "=======================================================", "ITEM", "QTY", "PRICE", "TOTAL(NGN)"); 


	int index = 0;
	int counter = 0;
	for (int count = 0 ; count < items.size(); count++){
	System.out.printf("	%s	%d	%.2f		%.2f%n", item.get(count),items.get(index), itemsd.get(counter), items.get(index) * itemsd.get(counter));
	index++;
	counter++;
	}

	System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

	int i= 0;
	int j = 0;
	total = 0;

	for (int k = 0; k <item.size();k++){
		double product = items.get(i) * itemsd.get(j);
		total += product;
		i++;
		j++;

	}
	
	total = quantity * perUnit;
	subTotal = total+total;
	discountRate = (discount *0.01) *subTotal;
	vat = 0.075 *subTotal;
	
	System.out.println("\n\n");
	System.out.printf("		Sub Total:	%.2f%n			discount:		%.2f%n		VAT @ 7.5:	%.2f%n", subTotal, discountRate, vat);
	System.out.println("=======================================================================================");

	double totalBill = (subTotal - discountRate) + vat;
	System.out.printf("		Total Bill: 	%.2f%n", totalBill);

	System.out.printf("%n THIS IS NOT AN RECEIPT KINDLY PAY %.2f%n =================================================================================================================================================",totalBill);

	System.out.println("==================================================================================================================");

	System.out.println("How much did the customer give to you?");
	double amountPaid  = input.nextDouble();
	double balance= 0;
		if(amountPaid >totalBill){
		balance = amountPaid - totalBill;

		}
		else if(amountPaid < totalBill){
		balance = totalBill - amountPaid;
		}
		else{
			System.out.println(" Pay appropriate amount");
		}
	System.out.printf("%s%n%s%n%s%n%s%n Cashier's Name: %s%n Customer's Name: %s%n%s%n	%s	%s	%s		%s%n",  "SEMICOLON STORES","MAIN BRANCH", "LOCATION:  312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS",  "TELL: 08103722570",  "Date: 01/Oct/1960 12:00 am", cashierName, name, "=======================================================", "ITEM", "QTY", "PRICE", "TOTAL(NGN)"); 
	int index2 = 0;
	int counter2 = 0;
	for(int count1 = 0 ; count1< item.size();count1++){
	  System.out.printf("	%s	%d	%.2f		%.2f%n", item.get(count1),items.get(index2),itemsd.get(counter2),items.get(index2)*itemsd.get(counter2));
	index2++;
	counter2++;
	}

	System.out.println("----------------------------------------------------------------------------------------------------------------------------");
	System.out.printf("%n%n");
	System.out.printf("	Sub Total:	%.2f%n		discount:		%.2f%n		VAT @ 17.50:	%.2f%n", subTotal,discountRate,vat);

	System.out.printf("		Total Bill:	%.2f%n		AmountPaid:		%.2f%n		Balance: 	%.2f%n", totalBill, amountPaid, balance);
	System.out.printf("%s%n","========================================================================================================================", 	"THANKS FOR YOUR PATRONAGE");

	System.out.println("======================================================================================================");
	












}




}