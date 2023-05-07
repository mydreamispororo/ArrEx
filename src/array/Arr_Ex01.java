package array;

import java.util.Scanner;

class Member {
	private String userid;
	private String passwd;
	private String username;
	
	public Member() {}
	
	public Member(String userid, String passwd, String username) {
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
	}
	
	public String showMember() {
		return "아이디 : " + userid + " | 비밀번호 : " + passwd + " | 회원명 : " + username;
	}
	
}

public class Arr_Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//회원가입 3명 + 생성자 3 + scanner + 생성자를 이용해서 저정/출력
		//객체 필드 : userid, passwd, username;
		//객체 이름 : Member
		Member[] m = new Member[5];
		
		//입력 for
		for(int i = 0; i < m.length; ++i) {
			System.out.print("아이디 > ");
			String uid = sc.next();
			
			System.out.print("비밀번호 > ");
			String pwd = sc.next();
			
			System.out.print("회원명 > ");
			String uname = sc.next();
			
			
			m[i] = new Member(uid, pwd, uname);
			System.out.println();
		}
		System.out.println("회원가입이 완료되었습니다.");
		
		//출력 for
		System.out.println("가입된 회원 수 : " + m.length + "명");
		for(Member member : m) {
			System.out.println(member.showMember());
		}
		

	}

}
