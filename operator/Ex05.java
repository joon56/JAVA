package operator;

public class Ex05 {

	public static void main(String[] args) {
		// 비교 연산자 : 대소관계
		// 종류 : <, >, >=, <=, ==, !=
		// 비교의 결과는 boolean 타입
		
		int n = 10;
		
		System.out.println(n > 3);
		System.out.println(n < 3);
		System.out.println(n <= 10);
		System.out.println(n == 10);
		System.out.println(n != 10);
		
		// 비교의 결과는 boolean이고 이는 변수에 저장 가능
		
		boolean result = 10 == 9; // 우변의 우측부터 계산
		System.out.println(result);

	}

}
