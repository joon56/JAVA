package method;

public class Ex02 {

	
	static void hello(int n) {  // 매개변수 : 전달인자 저장 변수
		for (int i = 1; i <= n; i++) {
			System.out.println("hello");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		

		hello(3); // 전달인자(arguments)
		hello(4);
		
		
		
	}

}
