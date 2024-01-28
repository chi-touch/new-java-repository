public class ArrayLargest2{

	public static void main(String[] args){
	int [] array2 = {23,30,1,2,45};

	int largest = array2[0];

	for(int i = 1; i < array2.length; i++){
		if(array2[i] > largest){
		largest = array2[i];
		}

	}
	System.out.print(largest);



}


private int largest;

public void setLargest(int largest);
	return largest;


public void getLargest(int largest);
 	this.largest = largest;



}