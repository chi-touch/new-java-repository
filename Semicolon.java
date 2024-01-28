import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Semicolon{

	public static List<Item> itemList = new ArrayList<>();

	public static Scanner input = new Scanner(System.in);
	public static String cashierName;



	public static double total;

	public static double customerPayment;
	Item items;


	public static double vatpercentage = 17.50;
	public static String customerName;
	public static double discount;
	public static double customerAmountPaid;

	public static Calendar myCalendar = Calenda.getInstance();


	public static void main(String[] args){

		mainMenu();
		otherMenu();



}

		public static void mainMenu(){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the customer's Name");
		String myCustomerName = input.nextLine();
		setCustomerName(myCustomerName);

		System.out.println("What did the user buy");
		String itemBought = input.nextLine();

		System.out.println("How many pieces?");
		int quantity = input.nextInt();

		System.out.println("How much per unit?");
		double perUnit = input.nextDouble();			purchasedItem(itemList,itemBought,perUnit,quantity);
			addMoreItem();


	}

		public static void purchasedItem(List<Item>itemList, String itemBought, double prince, int quantity);
		
			double totalAmount = price * quantity;
			Item items = new Item(itemBought, price, quantity, totalAmpont);
			itemList.add(items);


	}

		public static double subTotal(){
		total = 0.0;
		for(Item items : itemList){
		total += items.getTotalAmount();

		}
			return total;
	}

		public static void addMoreItem(){
		Scanner input = new Scanner(System.in);

		System.out.println("Add more  Item? Type Yes or No");
		String addItem = input.nextLine();

		if(addItem.equalsIgnoreCase("Yes")){
			repeatMenu();
		}

		if(addItem.equalsIgnoreCase("No")){
			cashierNameMenu();
		   }
	}

		public static void repeatMenu(){
		Scanner input = new Scanner(System.in);

		System.out.println("What did the user buy");
		String itemBought = input.nextLine();

		System.out.println("How many pieces?");
		int quantity = input.nextInt();

		System.out.println("How much per unit");
		double perUnit = input.nextDouble();
		purchasedItem(itemList, itemBoughht, perUnit, quantity);
		addMoreItem();

	}

		
		public static void cashierNameMenu(){
		Scanner input = new Scanner(System.in);
		System.out.println("What is your Name");


		String myCashierName = input.nextLine();

		setCashierName(myCashierName);

		System.out.println("How many discount will you get?");
		double discount = input.nextDouble();

		customerInvoice();

	}

		public static void printItemDetails(){
		
		for(Item items : itemList){
		System.out.println(" " + items.getItemName() + "\t\t" + items.getPrice() + "\t\t" + items.getQuantity() + "\t\t" + items.geTotalAmount());

		}
		
	}
		
		public static void setCashierName(String thisCashierName){

			cashierName = thisCashierName;
		}
		
		public static void setCustomerName(String thisCustomerName){
			customerName = thisCustomerName;	
		}

		public static double discount(){
		double customerDiscount = (discount/ 100) * total;
			return customerDiscount;
		   }

		public static double VAT(){
		total = 0.0;
		for(Item items : itemList){
			total += items.getTotalAmount();
		}
			return((vatPercentage/100)* total);
	    }

		public static double totalBill(){
		double subTotal = subTotal();
		double finalDiscount= discount;
		double vat = VAT();
		double finalBill = subTotal
 + finalDiscount + vat;

		return finalBill;
           }




		public static void customersInvoice(){
		System.out.println("		");
		System.out.println("		");
		System.out.println("		");
		System.out.println(" SEMICOLON STORES");
		System.out.println(" MAIN BRANCH");
		System.out.println(" LOCATION: 321, HERBERT MACAULAY WAY, SABO, YABA, LAGOS");
		System.out.println(" TELL: 03293828343");
		System.out.println("Date:" + myCalendar.getTime());
		System.out.println("Cashier:"+ cashierName);
		System.out.println("Customer Name:"+ customerName);
		System.out.println("		");
		System.out.println("==========================================");
		System.out.println(" ITEM\t\tPRICE\t\tQTY\t\tTOTAL(NGN) ");

			System.out.println("=======================================");
		printItemDetails();
	System.out.println("---------------------------------------");
		System.out.println("\t\t\t\tSub Total:		"+ subTotal());
		System.out.println("\t\t\t\tDiscount:		"+ discount());
		System.out.println("\t\t\t\tVAT @ 17.50%:		"+ VAT());
		System.out.println("=======================================");
		System.out.println("\t\t\t\tBill Total:		"+ totalBill());
		System.out.println("=======================================");
		System.out.println("THIS IS NOT A RECEIPT KINDLY PAY"+ totalBill);
		System.out.println("=======================================");



       }


		public static void otherMenu(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("How much did the customer give you?");
		 customerPayment = input.nextDouble();

		customerReceipt();



}
		
		public static double amountPaid(){
		customerAmountPaid = customerPayment;
		return customerAmountPaid;

	}

		public static double balance(){
		double customerBalance = customerAmountPaid - totalBill();
		return customerBalance;

	    }
		
		public static void customerReceipt(){
		System.out.println("		");
		System.out.println("		");
		System.out.println("		");
		System.out.println(" SEMICOLON STORES");
		System.out.println(" MAIN BRANCH");
		System.out.println(" LOCATION: 321, HERBERT MACAULAY WAY, SABO, YABA, LAGOS");
		System.out.println(" TELL: 03293828343");
		System.out.println("Date:" + myCalendar.getTime());
		System.out.println("Cashier:"+ cashierName);
		System.out.println("Customer Name:"+ customerName);
		System.out.println("		");
		System.out.println("==========================================");
		System.out.println(" ITEM\t\tPRICE\t\tQTY\t\tTOTAL(NGN) ");

				System.out.println("=======================================");
		printItemDetails();
	System.out.println("---------------------------------------");
		System.out.println("\t\t\t\tSub Total:		"+ subTotal());
		System.out.println("\t\t\t\tDiscount:		"+ discount());
		System.out.println("\t\t\t\tVAT @ 17.50%:		"+ VAT());
		System.out.println("=======================================");
		System.out.println("\t\t\t\tBill Total:		"+ totalBill());
		System.out.println("\t\t\t\tAmount paid:		"+ amountPaid());
		System.out.println("\t\t\t\tBalance:		"+ balance());
					System.out.println("==============================================");
		System.out.println("		THANKS FOR YOUR PATRONAGE ");
				System.out.println("=======================================");




	}	





}