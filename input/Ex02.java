package input;

import java.lang.System; //원래 System.in, out 쓰려면 이거 적어야함, 그러나 많이 쓰니까 자동으로 내재 된 것
import java.util.Scanner;

// lang을 제외한클래스는 다 import 해야함

public class Ex02 {

	public static void main(String[] args) {
		// 데이터를 쉽게 읽어올 수 있게 도와주는 도구
		// Scanner 클래스
		
		Scanner sc = null;
		
		sc = new Scanner(System.in);  // scanner가 괄호 안의 부분을 스캔함
		
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();  // 정수값을 가져오는 것
		
		System.out.println(n);
		
		sc.close(); // 안 적으면 scanner가 계속 괄호 안 부분을 보고 있어서 경고 뜸 -> scanner 닫기 습관화

	}

}
