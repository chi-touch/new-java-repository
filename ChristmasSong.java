import java.util.Scanner;
public class ChristmasSong{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	

	System.out.println("The Twelve Days of Christmas Song");
	for (int i = 1; i <= 12; i++){
	System.out.print("On the " );
	switch(i){
	case 1: System.out.print("first"); break;
	case 2: System.out.print("second"); break;
	case 3: System.out.print("third"); break;
	case 4: System.out.print("four"); break;
	case 5: System.out.print("fifth"); break;
	case 6: System.out.print("sixth"); break;
	case 7: System.out.print("seventh"); break;
	case 8: System.out.print("eight"); break;
	case 9: System.out.print("nineth"); break;
	case 10: System.out.print("tenth"); break;
	case 11: System.out.print("eleventh"); break;
	case 12: System.out.print("twelfth"); break;

	}
	System.out.println(" Days of Christmas My True love gave to me: ");

	switch(i){

		case 12: System.out.println("Twelve people Dancing,");
		case 11: System.out.println("Eleven pipers piping,");
		case 10: System.out.println("Ten lords a-leaping,");
		case 9:  System.out.println("Nine ladies dancing,");
		case 8:  System.out.println("Eight maids a-milking,");
		case 7:  System.out.println("Seven swans a-swimming,");
		case 6:  System.out.println("Six geese a-laying,");
		case 5:  System.out.println("Five golden rings,");
		case 4:  System.out.println("Four calling birds,");
		case 3:  System.out.println("Three French hens,");
		case 2:  System.out.println("Two turtle doves,");
		case 1:  System.out.println("And a partridge in a pear tree!");

	}
	System.out.println();
	System.out.println();

	}

	

}
}