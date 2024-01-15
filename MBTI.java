//import java.util.Arrays;
import java.util.Scanner;

public class MBTI {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        String request;

       //result();
       
	}
   private static final int[][] lifeStyle = new int[4][2];


	//int i = 0;
  	 private static void result() {
    	 Scanner input = new Scanner(System.in);
      	 String request;

        lifeStyle[0][0] = 0;
        lifeStyle[0][1] = 0;
        lifeStyle[1][0] = 0;
        lifeStyle[1][1] = 0;
        lifeStyle[2][0] = 0;
        lifeStyle[2][1] = 0;
        lifeStyle[3][0] = 0;
       lifeStyle[3][1] = 0;

        for (int i = 0; i <= 20;i++) {
            System.out.println("Select A or B");
            switch (i) {
                case 1:
                    System.out.println("\nQuestion 1. \n A. Expend energy, enjoy groups \t B. Conserve energy, enjoy one-on-on");
                    request = input.nextLine();

		  //  while(!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

		//	System.out.println("Expected A or B as Response");
		//	System.out.println("I know this is an error, Please retry again");
			  request = input.nextLine();
		//	}
        
		       if(request.equalsIgnoreCase("A")){
				  lifeStyle[0][0]++;
			 } else {
				  lifeStyle[0][1]++;
			}
		    
		  /*      break;

                case 2:
                    System.out.println("Question 2. \n A. Interpret Literally \t B. Look for meaning and possibilities ");
                    request = input.nextLine();

		    while(!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			  System.out.println("Expected A or B as Response");
			  System.out.println("I know this is an error, Please retry again");
			  request = input.nextLine();
		     }
		     if(request.equalsIgnoreCase("A")){
			         lifeStyle[1][0]++;
		     } else {
				 lifeStyle[1][1]++;
		     }
		     break;


                case 3:
                    System.out.println("Question 3. \n A. Logical, thinking, questioning \t B. Empathetic, feeling, accommodating");
                    request = input.nextLine();
		
		    while(!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){
			
			System.out.println("Expected A or B as Response");
			System.out.println("I know this is an error, Please retry again");
			 request = input.nextLine();
		    }
		    if(request.equalsIgnoreCase("A")){
			      lifeStyle[2][0]++;
		    } else {
			      lifeStyle[2][1]++;
		    }
		     break;


                case 4:
                    System.out.println("Question 4 \n A. Organized, Orderly \t B. Flexible, Adaptable");
                    request = input.nextLine();

		    while(!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			System.out.println("Expected A or B as Response");
			System.out.println("I know this is an error, Please retry again");
			request = input.nextLine();
		    }
	            if(request.equalsIgnoreCase("A")){
			        lifeStyle[3][0]++;
		    } else {
				lifeStyle[3][1]++;
		    }
		    break;

                case 5:
                    System.out.println("Question 5. \n A. More outgoing, think our loud \t B. More Reserved, think to yourself");
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
                   break;


                case 6:
                    System.out.println("Question 6. \n A. Practical, realistic, experiential \t B. Imaginative, innovative, theoretical");
                    request = input.nextLine();
		
		     while(!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			      System.out.println("Expected A or B as Response");
			      System.out.println("I know this is an error, Please retry again");
			      request = input.nextLine();
			}
			if(request.equalsIgnoreCase("A")){
				lifeStyle[1][0]++;
			} else {
				lifeStyle[1][1]++;
			}                  
                    break;

                case 7:
                    System.out.println(" Question 7. \n A.Candid, straight, forward, frank \t  B. Tactful, kind, encouraging");
                    request = input.nextLine();

		    while(!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			 System.out.println("Expected A or B as Response");
			 System.out.println("I know this is an error, Please retry again");
			  request = input.nextLine();
		    }
		    if(request.equalsIgnoreCase("A")){
				lifeStyle[2][0]++;
		    } else {
				lifeStyle[2][1]++;
		    }                   
                    break;

                case 8:
                    System.out.println("Question 8. \n A. Plan, Schedule \t  B. unplanned, spontaneous ");
                    request = input.nextLine();

		    while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			System.out.println("Expected A or B as Response");
			System.out.println("I know this is an error, Please retry again");
			  request = input.nextLine();
		    }
		    if(request.equalsIgnoreCase("A")){
			       lifeStyle[3][0]++;
		    } else {
			       lifeStyle[3][1]++;
		    }                   
                    break;


                case 9:
                    System.out.println("Question 9.\n A. Seek many tasks, public activities, interaction with others \n B. Seek private, solitary activities with quiet to concentrate");
                    request = input.nextLine();

		    while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			  System.out.println("Expected A or B as Response");
			  System.out.println("I know this is an error, Please retry again");
			  request = input.nextLine();
		     }
		     if(request.equalsIgnoreCase("A")){
				 lifeStyle[0][0]++;
		     } else {
				 lifeStyle[0][1]++;
		     }
			break;
                   
                case 10:
                    System.out.println(" Question 10. \n A. Standard, Usual, Conventional \t B. Different, Novel, Unique");
                    request = input.nextLine();

		    while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			System.out.println("Expected A or B as Response");
			System.out.println("I know this is an error, Please retry again");
			  request = input.nextLine();
		   }
		   if(request.equalsIgnoreCase("A")){
			       lifeStyle[1][0]++;
		   }else {
			      lifeStyle[1][1]++;
	           }
		                 
                    break;


                case 11:
                    System.out.println("Question 11. \nA. Firm, tend to criticize, hold the line \t B.Gentle, tend to appreciate, conciliate");
                    request = input.nextLine();

		     while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			    System.out.println("Expected A or B as Response");
			    System.out.println("I know this is an error, Please retry again");
			     request = input.nextLine();
			}
			if(request.equalsIgnoreCase("A")){
				  lifeStyle[2][0]++;
			} else {
		                  lifeStyle[2][1]++;
			}		      
                    break;

                case 12:
                    System.out.println("Question 12 \n A. Regulated, structured \t B. Easygoing, live and let live");
                    request = input.nextLine();

		    while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			   System.out.println("Expected A or B as Response");
			   System.out.println("I know this is an error, Please retry again");
			   request = input.nextLine();
		    }
		    if(request.equalsIgnoreCase("A")){
			       lifeStyle[3][0]++;
		     } else {
				       lifeStyle[3][1]++;
		    }
                   break;


                case 13:
                    System.out.println("Question 13. \n A. External, communicative, express yourself \t B. Internal, reticent, keep to yourself");
                    request = input.nextLine();

		      while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			     System.out.println("Expected A or B as Response");
			     System.out.println("I know this is an error, Please retry again");
			      request = input.nextLine();
			}
			if(request.equalsIgnoreCase("A")){
				     lifeStyle[0][0]++;
		         } else {
				       lifeStyle[0][1]++;
			}		      
                    break;

                case 14:
                    System.out.println("Question 14 \n A. Focus on here-and-now \t B. Look to the future, global perspective, big picture");
                    request = input.nextLine();

		     while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			     System.out.println("Expected A or B as Response");
			     System.out.println("I know this is an error, Please retry again");
			      request = input.nextLine();
		     }
		     if(request.equalsIgnoreCase("A")){
				       lifeStyle[1][0]++;
		     } else {
				       lifeStyle[1][1]++;
		     }
	                    break;

                case 15:
                    System.out.println(" Question 15.\n A. Tough-minded, just \t B. Tender-hearted and merciful");
                    request = input.nextLine();

		      while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			       System.out.println("Expected A or B as Response");
			       System.out.println("I know this is an error, Please retry again");
			       request = input.nextLine();
		      }
		      if(request.equalsIgnoreCase("A")){
				       lifeStyle[2][0]++;
		      }else {
				       lifeStyle[2][1]++;
		       }		                      
                    break;

                case 16:
                    System.out.println("Question 16.\n A. Preparation, plan ahead \t B. Go with the flow, adapt as you go ");
                    request = input.nextLine();

		    while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			         System.out.println("Expected A or B as Response");
			         System.out.println("I know this is an error, Please retry again");
			         request = input.nextLine();
			}
			    if(request.equalsIgnoreCase("A")){
				       lifeStyle[3][0]++;
			} else {
				       lifeStyle[3][1]++;
			}		      
                    break;

                case 17:
                    System.out.println("Question 17 \n A. Active, initiate \t B. Reflective, deliberate");
                    request = input.nextLine();

		      while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			      System.out.println("Expected A or B as Response");
			      System.out.println("I know this is an error, Please retry again");
			      request = input.nextLine();
			}
		        if(request.equalsIgnoreCase("A")){
				       lifeStyle[0][0]++;
			} else {
				       lifeStyle[0][1]++;
			}		                        
                    break;

                case 18:
                    System.out.println("Question 18.\n A. Facts, things, what is \t B. Ideas, dreams, what could be philosophical");
                    request = input.nextLine();

		    while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			    System.out.println("Expected A or B as Response");
			    System.out.println("I know this is an error, Please retry again");
			    request = input.nextLine();
		    }
		    if(request.equalsIgnoreCase("A")){
				lifeStyle[1][0]++;
		    } else {
			       lifeStyle[1][1]++;
		    }		                         
                    break;
                case 19:
                    System.out.println("Question 19 \nA. Matter of fact, issue-oriented \t B. Sensitive, people-oriented, compassionate");
                    request = input.nextLine();

		     while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

		          	System.out.println("Expected A or B as Response");         
		        	System.out.println("I know this is an error, Please retry again");
			       request = input.nextLine();
		      }
		      if(request.equalsIgnoreCase("A")){
				  lifeStyle[2][0]++;
		      } else {
			          lifeStyle[2][1]++;
		      }	                  
                    break;
                case 20:
                    System.out.println("Question 20 \n A. Control, governB. Latitude, freedom");
                    request = input.nextLine();

		    while (!request.equalsIgnoreCase("A") && !request.equalsIgnoreCase("B")){

			     System.out.println("Expected A or B as Response");
			     System.out.println("I know this is an error, Please retry again");
			     request = input.nextLine();
		     }
		     if(request.equalsIgnoreCase("A")){
			       lifeStyle[3][0]++;
		     } else {
			       lifeStyle[3][1]++;
		     }
                   break;
            }
        }
    }
        //private static void result() {
        if (lifeStyle[0][0] > lifeStyle[0][1]){
            System.out.print("E");
        } else {
            System.out.print("I");
        }

        if (lifeStyle[1][0] > lifeStyle[1][1]){
            System.out.print("S");
        } else {
            System.out.print("N");
        }

        if (lifeStyle[2][0] > lifeStyle[2][1]){
            System.out.print("T");
        } else {
            System.out.print("F");
        }

        if (lifeStyle[3][0] > lifeStyle[3][1]){
            System.out.print("J");
        } else {
            System.out.print("P");*/
//}
}
}
}
}
