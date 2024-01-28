import java.util.Arrays;
public class ReverseOddElement{

	public int[] reverse(int [] element){

	int [] numbers = new int[element.length];
	int count =0;

		for(int i = element.length-1; i<=0;i--){
			numbers[count] = element[i];
			count++;
		}
	return reverse();
	}
	
	public static void main(String [] args){
		ReverseOddElement values = new ReverseOddElement();

	int [] odd = {1,2,1,2,3,4};

	System.out.print(Arrays.toString(values.reverse(odd)));

	}



   }

	