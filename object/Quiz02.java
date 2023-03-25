package object;

import java.util.Scanner;

class Account {
	String id;
	String pw;
	
	Account(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	// hashcode()로도 가능
	void login(Account a) {
		if(id.equals(a.id) && pw.equals(a.pw)) {
			System.out.println("로그인을 환영합니다!");
		}
		else {
			System.out.println("존재하지 않는 계정입니다");
		}
	}
	
	
}

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account storeacc = new Account("itbank", "qwe@123");
		
		String id, pw;
		
		System.out.print("아이디를 입력하시오 : ");
		id = sc.next();
		
		
		System.out.print("비밀번호를 입력하시오 : ");
		pw = sc.next();
		
		Account user = new Account(id, pw);
		
		storeacc.login(user);
		
		sc.close();

	}

}
