package day02;

public class Ex04 {
	public static void main(String[] args) {
		// 이스케이프 시퀀스 : 문자열 내에서 틋구한 형태로 사용되는 집합
		// 이스케이프 시퀀스는 \와 결합
		
		System.out.println("Hello\nWorld");       // \n은 줄바꿈
		
		System.out.println("Hello \t\t World");   // \t은 들여쓰기
		
		System.out.println("\n저희 Java버전은 '8버전' 입니다");
		
		// System.out.println("\n저희 Java버전은 "8버전" 입니다");  
		// 이게 오류인 이유 - 큰 따옴표는 문자열 묶는데 쓰이기 때문에 왼쪽부터 순서대로 인식함 ->그러면 큰 따옴표 여러개 쓸 경우 인식이 안되는 구간이 있음
		
		 System.out.println("\n저희 Java버전은 \"8버전\" 입니다"); // '\'는 문자열 묶는 것을 제거
		 
		 System.out.println("저희 공유폴더 주소는 \\\\192.168.0.15 입니다"); // '\\'는 이스케이프 가능을 제거, \2개당 출력 \하나됨
	}
}
