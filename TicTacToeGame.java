import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe game simulation!!");
		char[] board=createBoard();
		char userSymbol=chooseLetter();
		showBoard(board);	
	}
	
	//UC1-Creating Empty board 
	public static char[] createBoard() {
		char[] board=new char[10];
		for(int index=1;index<board.length;index++) {
			board[index]=' ';
		}
		return board;
	}
	
	//UC2-User and computer choose letter for marking on board
	public static char chooseLetter() {
		char computerSymbol='X';
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter letter you want to choose X or O");
			char userSymbol=sc.next().toUpperCase().charAt(0);
			if(userSymbol=='X') {
				computerSymbol='O';
			}
			else if(userSymbol=='O'){
				computerSymbol='X';
			}
			else
			{
				System.out.println("Wrong input!! You can enter X or O");
				continue;
			}
			System.out.println("User symbol:"+userSymbol);
			System.out.println("Computer symbol:"+computerSymbol);
			return userSymbol;
		}
	}
	
	//UC3-Show Board to display current board status
	public static void showBoard(char[] board) {
		System.out.println("\n");
		System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
		System.out.println("---------");
		System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
		System.out.println("---------");
		System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
	}

}
