package _static;

// static은 인스턴스 공유 용도로도 쓰이지만 
// 인스턴스 없이 사용도 가능하다

public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println("원주율 : " + Math.PI);
		System.out.println("자연상수 : " + Math.E);
		
		// Math = new Math();
		// Math 클래스는 생성자가 private 처리 되어있음
		// 즉, 인스턴스 필요없고 그냥 바로 Math. 하고 쓰면됨
		
		System.out.println("-5의 절댓값 : " + Math.abs(-5));
		
		System.out.println("1.12345 = " + Math.round(1.12345));
		
		System.out.println("2^10 = " + Math.pow(2, 10));

	}

}
