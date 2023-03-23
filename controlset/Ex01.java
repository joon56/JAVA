package controlset;

import java.util.Scanner;

// 제어문 : 코드의 흐름을 제어하는 구문
// 조건문 : 참/거짓에 따라 코드 실행
// 반복문 : 참/거짓에 따라 루프 실행
// 보조 제어문 : 위의 구문을 보조하는 구문
public class Ex01 {

	public static void main(String[] args) {
		// 조건문 if : 참이면 종속 문장 실행
		// 종속 문장 : 특정 부분에 포함된 문장
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("성인");
			
		}

		else {
			System.out.print("성인 아님");
		}
		
		sc.close();

	}

}
