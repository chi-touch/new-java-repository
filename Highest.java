import java.util.Scanner;
public class Highest{

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number of student: ");
	int numberOfStudent = input.nextInt();
	double highestScore = 0;
	String name = "";

	for (int i=0; i <numberOfStudent; i++){
		System.out.println("Enter student name:");
		String studentName = input.next();

		System.out.println("Enter student score:");
		double score = input.nextDouble();
		
		if(score > highestScore){
			highestScore=score;
			name = studentName; 
		}

}
System.out.println(highestScore);
System.out.println(name);
}
}