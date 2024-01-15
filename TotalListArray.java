public class TotalListArray{

	public static void main(String[] args){
	int[] array = {32,40,23,10,2,50};
	int sum = 0;

	for(int i = 0; i < array.length; i++){
		sum += array[i];
	}
		System.out.printf("the sum of array elements: %d%n", sum);


}

}