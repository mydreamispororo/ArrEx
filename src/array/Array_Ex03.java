package array;

import java.util.Scanner;

class Board { // 포트폴리오 기본 : 다중게시판(게시판 + 관리모드) -> 게시물번호, 게시물제목, 게시물 작성자, 게시물 내용, 조회수, 작성일,
				// 첨부파일, ip...
	private String subject;
	private String writer;
	private String content;
	private int visit = 0;

	public Board() {
	}

	public String showBoard() {
		return "게시물 제목 : " +	subject + "작성자 : " + writer + "내용 : " + content + "조회수 : " + visit;
			
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getVisit() {
		return visit;
	}

	public void setVisit(int visit) {
		this.visit = visit;
	}

}

public class Array_Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//객체 + getter, setter + 게시물 5개 + scanner
		
		final int ARRAY_CONUT = 5; //배열 개수(공간)을 상수로 표현 -> 5개
		Board[] board = new Board[ARRAY_CONUT];
		
		//게시물을 5개 등록하려면 생성자(new)가 5개 만들어져야됨
		for(int i = 0; i < board.length; ++i) {
			board[i] = new Board();
			
			System.out.print("공지사항 제목 : ");
			String s = sc.next();
			
			System.out.print("작성자  : ");
			String u = sc.next();
			
			System.out.print("게시물 내용 : ");
			String c = sc.next();
			
			//입력 setter
			board[i].setSubject(s);
			board[i].setWriter(u);
			board[i].setContent(c);
			System.out.println();
		
		}
//		//출력 : get
//		for(int i = 0; i < board.length; ++i) {
//			System.out.println(board[i].getSubject());
//			System.out.println(board[i].getWriter());
//			System.out.println(board[i].getContent());
//			System.out.println(board[i].getVisit());
//		}
		
		System.out.println("======================= 게시물 목록 =======================");
		for(int i = 0; i < board.length; ++i) {
			System.out.println((i+1) + "번 게시물 : " + board[i].showBoard());
		}
		System.out.println("================================================");
	}

}
