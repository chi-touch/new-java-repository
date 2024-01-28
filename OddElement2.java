public class OddElement2{

	public void odd(int[] number){

	for(int i = 0; i< number.length; i+=2){

		System.out.print(number[i]+" ");
	}

}

	public static void main(String [] args){
		OddElement2 value = new OddElement2();

		int[] numbers = {20,30,11,1,5,3};
		
		value.odd(numbers);
	}

}