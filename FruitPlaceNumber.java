import java.util.Arrays;
public class FruitPlaceNumber{

	public static void main(String[] args){

	String[]fruit = {"grape","mango","pawpaw","orange"};
	String[]place ={"market","school","church","field"};
	String[]number = {"2","4","6","8"};
	
	String[]sum =new String[fruit.length + place.length + number.length];


	int count =0;
	for(int i = number.length-1;i>=0; i--){
	sum[count] = number[i];
	count+=3;

	}

	int counter = 1;
	for(int i =0; i <= fruit.length-1;i++){
	sum[counter] = fruit[i];
	counter+=3;
		
	}

	int total = 2;
	for(int k = 0; k < place.length;k++){
	sum[total] = place[k];
	total+=3;
	}
		System.out.print(Arrays.toString(sum));


}















}
