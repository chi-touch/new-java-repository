import java.util.Scanner;
public class GasMileage{

	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int miles = 0;
	int gallons =0;
	int count = 0;


	while(miles != -1 && gallons != -1){

	System.out.print("Enter miles driven: ");
	miles = input.nextInt() ;

	System.out.print("Enter gallons: ");
	gallons = input.nextInt();
	count ++;

	int milesPerGalloon = miles / gallons;
	double average =  milesPerGalloon / count;

	System.out.printf("The miles/gallons is %d%n", milesPerGalloon );
	System.out.printf("%.2f is the average of milesPerGalloon%n",average);

}	
	//double milesAverage = miles / count;
	//double gallonsAverage = gallons / count;

	
	//System.out.printf("%f is the miles average%n", miles);
	


}
}