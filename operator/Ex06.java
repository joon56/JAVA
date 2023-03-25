package operator;

public class Ex06 {

	public static void main(String[] args) {
		// 논리연산자 : true/false 연산
		// 종류 : &&, ||, !
		
		// && and : 양쪽 다 참
		// 다른 말로 곱 연산이라고 함
		System.out.println(true && true);    // 1 X 1
		System.out.println(true && false);   // 1 X 0
		//System.out.println(false && true);   // 0 X 1
		//System.out.println(false && false);  // 0 X 0
		
		
		// || or : 둘 중 하나만 참이면 참
		// 다른 말로 합 연산이라고 함
		//System.out.println(true || true);    // 1 + 1
		//System.out.println(true || false);   // 1 + 0
		System.out.println(false || true);   // 0 + 1
		System.out.println(false || false);  // 0 + 0
		
		
		// ! not : 참을 거짓으로 거짓을 참으로 바꾸는 연산
		// 반전연산이라고 함
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!true);  // !! 쓰면 반전 두 번이라 제자리
		

	}

}
