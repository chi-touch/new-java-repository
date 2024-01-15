public class Array{

	public static void main(String[]args ) {

	int[][] array1 ={{1, 2, 3},{4, 5}};
	int[][] array2 ={{1, 2}, {3},{4, 5, 6}};

	System.out.println("values in array1 by col are");
		outPutArray(array1);

	System.out.println("values in array1 by col are %n");
		outPutArray(array2);

}

	public static void outPutArrray(int[][] array) {
		for(int col =0;col < array.length; row++) {
			for(int row =0; row < array[col].length; col++) {
				System.out.printf("%d ", array[row][col]);
		}

		System.out.println();
		



}







}



}