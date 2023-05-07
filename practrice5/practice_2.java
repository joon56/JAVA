
public class practice_2 {
	static int a = 10; // static 변수
	
	public static void call() { // static 메서드
		System.out.println("static method call");
	}

	public static void main(String[] args) {
		// static은 객체화 없이도 사용 가능
		System.out.println(a);
		call();

	}

}
