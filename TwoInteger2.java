import java.util.Arrays;
public class TwoInteger2{

	public static void main(String[] args){

	String[] fruit = {"mango","banana","pawpaw"};
	String[] fruit2 = {"orange","pineapple","cashew"};

	int i =0;

	String[]sum = new String[fruit.length + fruit2.length];

	for(int j = 0; j < fruit.length; j+=1){
	sum[i]=fruit[j];
	i+=2;

	}
	int count = 1;
	for(int j =0; j <=fruit2.length-1;j++){
	sum[count] = fruit2[j];
	count+=2;
	
	}
	System.out.print(Arrays.toString(sum));
	
	
	
}


}