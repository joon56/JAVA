package other;

// 인터페이스
// 추상 클래스보다 한 단계 더 추상화된 클래스
// 추상클래스와는 다른 클래스
// 추상 클래스처럼 인스턴스 생성 불가능 
// 필드는 모두 public static final 속성이 자동으로 부여된다
// 메서드는 모두 public abstract 속성을 가진다
// 즉, 인스턴스 멤버가 하나도 없다

// 중요!!) 인터페이스는 다중 상속이 가능하다

public interface FlyAble {
	String type = "날개";		// public static final 생략
	
	void fly();
}
