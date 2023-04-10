package other;


// 일반 클래스 - 범용성이 떨어짐
// - 외부에서 불러서 쓰는 것 불가능, 같은 패키지에서만 사용
// - 어짜피 외부에서 사용할 수 없기 때문에 파일명과 클래스명이 같지 않아도 됨.
// - 그래서 한 페이지에 여려개 작성 가능
public class Car {
	private String model;
	private int speed;
	
	public Car(String model) {
		
		this.model = model;
	}
	
	public void show() {
		System.out.printf("%s (%dkm/h)\n", model, speed);
	}
	
	public int accel(int a) {
		this.speed += a;
		show();
		
		return this.speed;
		
	}
	
	public int _break(int b) {
		this.speed -= b;
		show();
		
		return this.speed;
	}
	
	
}

