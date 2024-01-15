public class ArrayWahala{
	public static void main(String[] args){
	char[][] ticTacToe = new char[3][3];
ticTacToe[0][0] = 'X';
ticTacToe[0][1] = 'O';
ticTacToe[0][2] = 'X';


ticTacToe[1][0] = 'X';
ticTacToe[1][1] = 'O';
ticTacToe[1][2] = 'O';

ticTacToe[2][0] = 'O';
ticTacToe[2][1] = 'X';
ticTacToe[2][2] = 'X';

for(char[] rows: ticTacToe){
	for(char column: rows){
		System.out.print(column+" ");

}
System.out.println();

// note. this is a multidimentional array

}



}




}