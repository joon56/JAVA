
public class practice_1 {
	int a = 5; // 클래스 영역의 변수
	
	public void call() { // 클래스 영역의 메소드
		System.out.println("call method");
	}

	public static void main(String[] args) {
		// static이 없을 경우에는 객체화를 해야함
		practice_1 nst = new practice_1(); // 객체화
		System.out.println(nst.a);
		nst.call(); // 객체화를 해야하는 클래스 영역의 변수, 메소드를 사용 가능
	}

}
