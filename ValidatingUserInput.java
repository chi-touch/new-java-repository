import java.util.Scanner;
public class ValidatingUserInput{

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int passes = 0;
	int failure =0;
	int studentCounter = 1;


	while(studentCounter <= 10){
		System.out.print("Enter result(1=pass,2=fail): ");
		int result = input.nextInt();


			if(result ==1){	
			    passes = passes + 1;
		      }
		       else if (result == 2){
			    failure = failure +1;
		      }

	

		          if (result ==1 || result == 2)
				{studentCounter = studentCounter + 1;}
	
		 }
		
	            
		       System.out.printf("passed:%d%n failed: %d%n", passes, failure);

		       if(passes > 8){
			    System.out.println("Bonus to instructor!");
		       }
		

	


   }

}