package array;

import java.util.Scanner;

class Board {
	String boardTitle;
	String boardName;
	String boardContent;
	
	public Board() {}
	
	public Board(String boardTitle, String boardName, String boardContent) {
		this.boardTitle = boardTitle;
		this.boardName = boardName;
		this.boardContent = boardContent;
	}
	
	public String showBoard() {
		return "제목 : " + boardTitle + "이름 : " + boardName + "컨텐츠 : " + boardContent;
	}
	
}

public class Arr_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Board[] board = new Board[5];

		for(int i = 0; i < board.length; ++i) {
			System.out.print("제목 : ");
			String title = sc.next();
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("컨텐츠 : ");
			String con = sc.next();
			
			board[i] = new Board(title, name, con);
			System.out.println();
		}
		System.out.println("게시물 수 : " + board.length + "개");
		for(Board b : board) {
			System.out.println(b.showBoard());
		}
		
		
		

	}

}
