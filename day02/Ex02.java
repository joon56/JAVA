package day02;

public class Ex02 {

	public static void main(String[] args) {
		// 출력함수 : 화면에 데이터를 표시, 출력
		
		// 1. println() : 출력과 줄바꿈이 포함됨
		System.out.println("Hello");
		System.out.println("Java");       //빈 println()는 그냥 줄바꿈용
		
		// 2. print() : 줄바꿈이 없는 출력문
		System.out.print("Hello");
		System.out.print("Java"); 
		
		// 3. printf() : 서식을 활용한 출력
		System.out.printf("이름 : %s (나이 : %d세)", "홍길동", 17);
		
		//문자열은 " " 큰 따옴표로 묶인 데이터, 단어나 문장을 표현하는 타입
		//정수  : 따옴표가 없는 숫자 데이터, 연산을 위한  데이터
	}

}
