package method;

public class Ex03 {

	// 메소드의 종류
	// 반환값이 있는 메소드 / 반환값이 없는 메소드
	
	static int adder(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n = adder(3, 4);
		// 반환값이 있는거는 함수만 실행한다 해서 출력되는게 아니라
		// 다른 변수 안에 반환값을 넣어 따로 출력하거나 그냥 바로 있는대로 사용한다
		System.out.println(n);
		System.out.println(adder(1, 2) + adder(4, 5));
	}

}
