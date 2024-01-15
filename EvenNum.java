public class EvenNum{

	public static int[] evenPosition(int[] number){
	int length = number.length / 2;


	int[] array = new int [length];

	int count = 0;

	for(int i =1;i < number.length; i+=2){

	array[count] = number[i];
	count +=1;

	
	} 
	return array;
}


}