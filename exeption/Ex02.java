package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// try에서 여러 예외를 처리하는 구문
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		try {
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		System.out.println("n = " + n);
		
		}catch(InputMismatchException e) {
			
			System.out.println("에러 메서지 : 자료형 오류");
		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		// catch문을 여러개 작성하여 여러가지 예외들에 대해서 처리
		
		catch(Exception e) {
			// Exception 클래스는 예외 클래스의 최상위 클래스
			// 모든 예외 다 받아짐
			// 내가 모르는 오류를 위해, 혹은 모든 예외 쓰기 귀찮을 때
			
			System.out.println(e.getMessage());
		}
		
		finally {
			// 예외 발생과 상관없이 무조건 실행된다
			// sc.close처럼 자원을 회수하기 위해서 사용
			
			sc.close();
		}
		
		
	}

}
