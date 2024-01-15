import java.util.Arrays;
public class Joiner{

	public static void main(String[] args){
	String[] fruits = {"mango","pawpaw","apple","banana"};
	String[] newFruit = {"orange","watermelon","grape","onions"};
	int i = 0;

	
	String[]sum = new String [fruits.length + newFruit.length];

	for(int j = 0; j <=fruits.length-1;j++){
	sum[i] = fruits[j];
		i++;	
	}
	for(int j =0; j <= newFruit.length-1; j++){
	sum[i] = newFruit[j];
	i++;
	}
	System.out.print(Arrays.toString(sum));
}



}