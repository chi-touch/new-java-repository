public class AnotherDanglingElseProblem{

	public static void main(String [] args){

	int x = 9;
	int y = 11;


	if(x< 10){
		if(y > 10)
			System.out.println("*****"); }
	
	else
		System.out.println("#####"); 
		System.out.println("$$$$$");

	//Note: if x = 9 and y = 11: it would print ("*****")&("$$$$$");
	//Note: if x = 11 and y = 9 : it would print("#####")&("$$$$$");
}

}