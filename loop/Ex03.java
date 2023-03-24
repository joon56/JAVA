package loop;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 반복의 종류
		// 지정횟수 반복
		// 불특정 횟수 반복
		Scanner sc = new Scanner(System.in);
		int n = 1;
		
		while (n != 0) {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			System.out.println(n);
		}
		System.out.println("종료");
		sc.close();
		
	}

}
