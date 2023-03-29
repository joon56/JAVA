package _final;

// final : 마지막
// 1. 변수에 사용 : 변수의 공간이 바뀌지 않는 상수 공간으로 지정
// 2. 메서드에 사용 : 자식 메소드에서 오버라이딩을 받는다
// 3. 클래스에사용 : 상속이 불가능한  클래스가 된다

public class Ex01 {

	public static void main(String[] args) {
		
		int it = 10;
		final int fit = 10;
		
		System.out.println(it);
		System.out.println(fit);
		
		it = 50;
		// fit = 50;	final로 지정된거는 다른 값 변경 불가
		
		// final double PI = 3.141592;
		// 원주율차럼 완전히 정해진 값을 지정할 때 주로 사용
		
	}

}
