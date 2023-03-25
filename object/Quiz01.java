package object;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String logid;
		System.out.print("아이디를 입력하시오 : ");
		logid = sc.next();
		
		String logpw;
		System.out.print("비밀번호를 입력하시오 : ");
		logpw = sc.next();
		
		
		String storeID = "itbank";
		String storePW = "qwe@123";
		
		if(logid.equals(storeID) && logpw.equals(storePW)) {
			System.out.println("로그인을 환영합니다!");
		}
		else {
			System.out.println("존재하지 않는 계정입니다");
		}
		
		sc.close();

	}

}
