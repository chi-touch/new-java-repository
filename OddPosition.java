public class OddPosition{

	public static int[] oddElements(int[] numbers){
	int length = 0;

	if (numbers.length % 2 != 0) {
		length = (numbers.length / 2) + 1;
	}
	else {length = numbers.length / 2;}

	int[] newArray = new int[length];

	int count = 0;

	for(int i= 0; i< numbers.length; i=i+2){
		newArray[count] = numbers[i];
		count += 1;
	
	}

	return newArray;




}


}