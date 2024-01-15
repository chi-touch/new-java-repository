public class ModifiedCompoundInterestProgram{

	public static void main(String [] args){

	double interest = 0;
	double principal = 1000.0;
	int years = 0;
		System.out.printf("%2s %20s%n","years", "interest");

	
	 for(interest = 5;interest <= 10;++interest){
			years +=1;
		  double amount = principal * Math.pow(1.0 + (interest/100),years);
			System.out.printf("%4d %20.2f%n", years, amount);
		}

	}
	

	}

