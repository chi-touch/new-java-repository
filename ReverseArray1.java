public class ReverseArray1{

	public void array(int[] numbers){

	for(int i = numbers.length-1; i >= 0; i--){
		System.out.print(numbers[i]+" ");

	} 
	
}




	public static void main(String[] args){
	ReverseArray1 reverse = new ReverseArray1();

	int [] number = {1,2,3,4,5,6};

	reverse.array(number);
	
	

}


}