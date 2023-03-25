package operator;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 조건연산자 : 조건에 따라서 값을 선택하는 연산자
		// 일항 : a++ 같은거
		// 이항 : a + b 같은거
		// 삼항 : 조건식 ? 참 : 거짓
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("상수 입력 : ");
		n = sc.nextInt();
		
		String even = (n % 2 == 0) ? "짝수" : "홀수";
		
		System.out.printf("%d은 %s입니다", n, even);
		sc.close();

	}

}
