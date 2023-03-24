package loop;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// do while문
		// 최초 한 번은 무조건 실행된다.
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		do {
			System.out.print("정수 입력 (0 종료) : ");
			n = sc.nextInt();
			
			System.out.println(n);
		}while (n != 0);
		
		
		sc.close();
		
	}

}
