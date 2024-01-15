import java.util.Arrays;
import java.util.Scanner;
public class CreditCardValidator{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Hello, Kindly Enter Card details to verify:");
	String digit = input.nextLine();
	//.startWith

	//System.out.println("Credit Card Number is:"+ digit);
	int total = 0;
	int[] cardNumber = new int[digit.length()];

	//System.out.println("Credit Card Digit Length:"+ cardNumber.length);

	for(int i = 0; i < digit.length(); i++){
	cardNumber[i] = Character.getNumericValue(digit.charAt(i));
	}

	int[] doubleDigit = new int[cardNumber.length/2];
	int k = 0;
	for(int i = digit.length()- 2; i>=0; i -=2){
	doubleDigit[k] = cardNumber[i]*2;
	k++;
	}
	//System.out.println(Arrays.toString(doubleDigit));

	for(int j = 0;j < doubleDigit.length; j++){
	if( doubleDigit[j]>=10){
		doubleDigit[j] =doubleDigit[j]/10 + doubleDigit[j]%10;
	}
	}
//	System.out.println(Arrays.toString(doubleDigit));


	int totalEven1 = 0;
	for(int count =0;count < doubleDigit.length; count++){
	 totalEven1 +=doubleDigit[count];
	
	}
	//System.out.println(totalEven1);
	
	int totalOdd1 = 0;
	for(int count = 0; count< cardNumber.length; count+=2){
	totalOdd1 += cardNumber[count];
	}
	//System.out.println(totalOdd1);


	total = totalEven1 + totalOdd1;

	

	System.out.println("***************************************");
	if(total % 10 == 0){
	System.out.println("**Credit Card Validity Status: valid");

	}else{
		System.out.println("**Credit Card Validity Status: invalid");
	}

	if(cardNumber[0] == 4){
		System.out.println("**Credit Card Type: Visa Cards");
	}
	if(cardNumber[0]==5){
		System.out.println("**Credit Card Type: MasterCard");
	}

	if(cardNumber[0] ==3 && cardNumber[1] ==7){
		System.out.println("**Credit Card Type: American Express Cards");
		}

	if(cardNumber[0]==6){
		System.out.println("**Credit Card Type: Discover cards");
	}
	System.out.println("**Credit Card Number is:"+ digit);
	System.out.println("**Credit Card Digit Length:"+ cardNumber.length);
	System.out.println("**Credit Card Validity Status: invalid");
	System.out.println("***************************************");

}

}