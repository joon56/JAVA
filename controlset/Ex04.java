package controlset;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// switch case문
		// 선택한 값으로 코드 분리
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.println("1 ~ 3");
		menu = sc.nextInt();
		
		switch (menu) {    // 자바는 문자열도 switch에 들어갈 수 있음
		case 1:
			System.out.println("1번 선택");
			break;							//break 안 적고 하면 1 선택시 1, 2, 3 다 실행함
		case 2:								//switch case는 case 실행하고 나머지 코드 다 실행하기 때문
			System.out.println("2번 선택");
			break;
		case 3:
			System.out.println("3번 선택");
			break;
		default :
			System.out.println("없는 메뉴입니다.");
		}
		
		
		
		
		sc.close();
	}

}
