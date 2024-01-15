public class ModifiedCompoundInterest{

	public static void main(String [] args){
	double amount;
	double principal= 1000.0;
	
		System.out.printf("%s %7s %7s %7s %7s %7s %7s","year", "%5", "%6", "%7", "%8","%9","%10");
	for (double rate = 0.05;rate<= 0.10; rate+=0.01){
		System.out.println("interest at"+(rate*100)+"%rate");
		System.out.printf("%s %20s%n", "year","amount on deposit");

		for(int year = 1;year<=5;++year){
			amount = principal * Math.pow(1.0 +rate,year);
			System.out.printf("%4d%,20.2f%n",year,amount);
		}


}
}
}