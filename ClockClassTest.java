import java.util.Scanner;
public class ClockClassTest{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the how many hours:");
	int hour = input.nextInt();

	System.out.print("Enter the how many seconds:");
	int second = input.nextInt();

	System.out.print("Enter the how many minute:");
	int minute = input.nextInt();

	Clock myClockClass1 = new Clock(hour,second,minute);

System.out.printf("%02d: %02d: %02d%n",myClockClass1.getHour(),myClockClass1.getMinute(),myClockClass1.getSecsond());

	






}




}