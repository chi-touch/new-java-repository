import java.util.Arrays;
public class ArrayLargest1{

	public static void main(String[]args){
	int [] array = {23,1,34,90,2,15};

	int largest = array[0];


	for (int i = 1; i <array.length; i++){
		
		if(array[i]>largest) {
		largest = array[i];
		}
		
	}

		System.out.print(largest);
}



}