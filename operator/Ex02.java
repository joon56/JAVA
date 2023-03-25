package operator;

public class Ex02 {

	public static void main(String[] args) {
		// 대입 연산자 : 값을 할당하는 연산자
		// 종류 : =
		// 1. 대입 연산자의 좌변은 '공간', 우변은 '결괏값'
		// 2. 항상우변부터 수행
		// 3. 대입 연산의 양변의 자료형은 항상 일치시킨다
		
		int n = 10 + 20; // n = 30
		
		int n1, n2, n3 = 30; //n3 만 30
		n1 = n2 = n3 = 30; //우변부터 차례대로 30 넣음
		
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		
	}

}
