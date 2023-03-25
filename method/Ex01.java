package method;

public class Ex01 {

	
	static void hello() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		// 함수 : 일정 길이의 코드를 저장해두고 재사용하는 방식
		// 메소드 : 클래스 안에 작성된 함수, '객체지향'의 개념이 추가된 것
		
		hello();
		hello();

	}

}
