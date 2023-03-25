// 3번 패키지
package operator;

public class Ex01 {

	public static void main(String[] args) {
		// 산술 연산자 : 사칙연산 수행
		// 종류 : +, -, *, /,  %  파이썬만큼 많진 않음
		int n = 10;
		
		// 산술연산자는 변수의 값 자체에 영향을 주진 않음 
		System.out.println("n + 3 = " + (n + 3));
		System.out.println("n - 3 = " + (n - 3));

		// 곱하기 나누기는 애초에 우선순위가 높아서 굳이 괄호 안 쳐도 연산이 먼저 됨
		System.out.println("n * 3 = " + n * 3);
		System.out.println("n / 3 = " + n / 3);
		System.out.println("n % 3 = " + n % 3);
		
		// 나머지 연산 사용처
		// 1. 배수 구분  (n % 2 == 0)
		// 2. 수의 범위 제한 
		// 3. 수의 자릿수 추출
		
		int num = 123456;
		
		System.out.println(num % 10);
		System.out.println(num / 100000);
		System.out.println(num % 1000 / 10);
		
		
		int birth = 991215;
		
		int year = birth / 10000;
		int month = birth % 10000 / 100;
		int day = birth % 100;
		
		System.out.println("생년 : " + year);
		System.out.println("생월 : " + month);
		System.out.println("생일 : " + day);
	}

}
