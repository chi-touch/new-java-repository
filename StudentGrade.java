import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("How many student do you have");
	int student = input.nextInt();

	System.out.println("How many subject do you offer");
	int subject = input.nextInt();

	int[][] school = new int[student][subject];

	
	int count = 0;
	int total= 0;
	double average= 0;
	int pos = 0;
	
	

	for (int i = 0; i< school.length; i++){
	count++;
	  System.out.printf("Entering scores for student %d%n", i+1);

		for(int j = 0; j < school.length-1; j++){
		school[i][j] = subject[j];
		
		count++;
		  System.out.printf("Enter scores for subject %d%n", j+1);
		

	
		 school[i][j] = input.nextInt();
		
		}

		//total += subject[0][0];
		System.out.printf("%d", total);

		   
		

			
	}

		System.out.printf("STUDENT\t\tSUB2\t\t\tSUB3\t\tTOT\t\tAVE\tt\tPOS");	
		
	//int score =0;

	/*while(score !=-1){
		System.out.println("Enter score of student");
		//score = input.nextInt();
		System.out.println("Enter score of  subject");
		score = input.nextInt();
	

}*/








}










}