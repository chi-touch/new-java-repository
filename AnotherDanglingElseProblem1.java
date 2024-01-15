public class AnotherDanglingElseProblem1{

	public static void main(String [] args){

	int y = 8;
	int x = 5;

	if(y == 8){
		if(x == 5)
			System.out.println("@@@@@");}
		else
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");


//Note: if x = 5,y = 8 and there is an else statement it would print the first SOut and the last two SOut:("@@@@@")("$$$$$")("&&&&&"); 
//Note : without the else statement it would print jus the first SOut:("@@@@@");
//Note : if x = 5,y=8  and there is an else statement it would print the first SOut and the last SOut on the else tement having the second SOut commented and leaving the first SOut on the else statement without a comment:("@@@@@")("&&&&&");
//Note:



}







} 