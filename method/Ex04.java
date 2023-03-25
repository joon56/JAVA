package method;

public class Ex04 {
	
	static int adder(int n1, int n2) {
		return n1 + n2;
	}
	
	static int adder(int n) {
		return n + 1000;
	}
	
	static double adder(double n) {
		return n + 3.14;
	}
	
	public static void main(String[] args) {
		// method overload : 같은 이름의  메소드를 여러 개 작성하는 방식
		// 이름은 같아야 하고 매개변수의 형태는 달라야 한다
		// 반환형은 오버로딩에 영향을 주지 않는다 -> 함수 이름이랑 매개변수가 같으면 완전히 같은 함수로 취급
		
		System.out.println(adder(5, 4));
		
		System.out.println(adder(5));
		
		System.out.println(adder(5.0));
	}

}
