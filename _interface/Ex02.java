package _interface;

import other.USB;

public class Ex02 {

	public static void main(String[] args) {
		// 익명 중첩 클래스 
		// 이름 없는 클래스 - 일회용
		// 보통 기능이 구현되어있지 않은 ..
		// 추상틀래스나 인터페이스 객체를 상속 없이 생성하고 싶을 때사용
		
		
		USB usb = new USB() {
			
			@Override
			public void run() {
				System.out.println("32GB connected");
				
			}
		};
		
		PC pc = new PC();
		pc.connect(usb);
		
		
		
		// 람다식이라는 간편화된 식을 통해 더 간단하게 표현 가능하다
		USB usb1= () -> {
			System.out.println("64GB connected");
		};
		
		pc.connect(usb1);
	}

}
