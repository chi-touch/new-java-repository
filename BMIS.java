import java.util.Scanner;
public class BMIS{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight: ");
	double weightInKilograms =input.nextDouble();

	System.out.print("Enter height: ");
	double heightInMeters =input.nextDouble();



	double BMI = weightInKilograms/(heightInMeters * heightInMeters);

	if(BMI < 18.5)
		System.out.printf("you are underweight eat up%n");
	if(BMI > 18.5 && BMI ==24.9)
		System.out.printf("you have a normal weight maintain it%n");
	if (BMI > 25 && BMI == 29.9)
		System.out.printf("you don dey chop tomuch u go soon turn obese%n");
	if(BMI == 30 && BMI > 30)
		System.out.printf("oga you need not to chop again%n");

	System.out.printf("%.2f is the BMI result",BMI);













}










}