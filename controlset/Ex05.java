package controlset;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// switch문은 범위 조건 처리가 거의 불가능하다
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정수 입력 1~10");
		n = sc.nextInt();
		
		switch (n) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 9 :
			System.out.println("홀수");
			
		case 2 : case 4 : case 6 : case 8 : case 10 :  // 한 줄로 써도 됨
			System.out.println("짝수");			
		
		}
		sc.close();
	}

}
