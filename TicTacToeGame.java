import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board=createBoard();
		
		char userSymbol=chooseLetter();
		char computerSymbol='X';
		if(userSymbol=='X') {
			computerSymbol='O';
		}
		System.out.println("Computer symbol:"+computerSymbol);
	}
	
	//Creating Empty board 
	public static char[] createBoard() {
		char[] board=new char[10];
		for(int index=0;index<board.length;index++) {
			board[index]=' ';
		}
		return board;
	}
	
	//User and computer choose letter for marking on board
	public static char chooseLetter() {
		System.out.println("Enter letter you want to choose X or O");
		Scanner sc=new Scanner(System.in);
		char userSymbol=sc.next().charAt(0);
		System.out.println("User symbol:"+userSymbol);
		return userSymbol;
	}

}
