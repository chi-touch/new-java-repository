import java.util.Scanner;

public class MBTI2{
    public static void main(String[] args) {
	//Scanner input = new Scanner(System.in);
        //String request = input.nextLine();

        result();
       
}
   private static final int[][] lifeStyle = new int[4][2];


	//int i = 0;
   private static void result() {
        Scanner input = new Scanner(System.in);
       String request = input.nextLine();

        lifeStyle[0][0] = 0;
        lifeStyle[0][1] = 0;
        lifeStyle[1][0] = 0;
        lifeStyle[1][1] = 0;
        lifeStyle[2][0] = 0;
        lifeStyle[2][1] = 0;
        lifeStyle[3][0] = 0;
        lifeStyle[3][1] = 0;

        for (int i = 0; i < 20;i++) {
            System.out.println("Select A or B");
            switch (i) {
                case 1:
                    System.out.println("\nQuestion 1. \n A. Expend energy, enjoy groups \t B. Conserve energy, enjoy one-on-on");
                    request = input.nextLine();

		    while(!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			System.out.println("Expected A or B as Response");
			System.out.println("I know this is an error, Please retry again");
			 request = input.nextLine();
			}
        
		       if(request.equalsIgnoreCase("A")){
				  lifeStyle[0][0]++;
			 } else {
				  lifeStyle[0][1]++;
			}
}
}
}
}

		    