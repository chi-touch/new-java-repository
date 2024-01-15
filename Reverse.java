public class Reverse{

	public static void main(String [] args){
	int number = 408942;
	int reverse = 0;

	while (number != 0){
		int lastNumber = number % 10;
		reverse = reverse *10 + lastNumber;
		number = number /10;
}
	System.out.printf("%d the reverse of a given number list is:", reverse);

}






}