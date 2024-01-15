import java.util.Scanner;
public class WorldPop{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	double currentWorldPopulation = 8015869000f;

	double annualWorldGrowthRate = 0.9;

	double year1 = currentWorldPopulation;
	double year2 = year1 + (year1 * 0.9);
	double year3 = year2 + (year2 * 0.9);
	double year4 = year3 + (year3 * 0.9);
	double year5 = year4 + (year4 * 0.9);

	System.out.printf("%.0f is estimated world population%n",year1); 
	System.out.printf("%.0f is estimated world population%n",year2);
	System.out.printf("%.0f is estimated world population%n",year3);
	System.out.printf("%.0f is estimated world population%n",year4);
	System.out.printf("%.0f is estimated world population",year5);

	

}



}