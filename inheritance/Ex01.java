package inheritance;

// 상속 : 기존에 작성된 클래스의 내용을 물려받아서 새로운 클래스를 작성하는 기법

// 상속을 해주는 클래스 : 부모, 상위, 슈퍼, 기반 클래스
// 상속을 받는 클래스 : 자식, 하위, 서브, 파생 클래스

class Super {
	int supNum = 10;
	
	void showSuper() {
		System.out.println("부모의 메소드입니다.");
	}
}

class Sub  extends Super{
	int subNum = 30;
	
	void showSub() {
		System.out.println("자식의 메소드입니다.");
	}
}


public class Ex01 {
		public static void main(String[] args) {
			Super sup = new Super();
			
			System.out.println("sup 필드 : " + sup.supNum);
			sup.showSuper();
			
			
			// 부모는 자식에서 생성된 멤버는 모름
			// 자식은 부모 + 자신꺼 다 쓸 수 있음
			// System.out.println("sup 필드 : " + sub.supNum);
			
			
			
			Sub sub = new Sub();
			
			System.out.println("\nsub필드 : " + sub.subNum);
			
			sub.showSuper();
			sub.showSub();
		}
}
