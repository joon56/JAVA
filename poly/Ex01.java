package poly;

// 다형성 : 다양한 형태를 가짐을 의미
// 하나의 기능으로 여러가지 명령을 수행하기 위해 사용

// 다형성을 구현하기 위한  조건
// 1. 상속관계 : 자식객체를 묶어서 처리하기 위함
// 2. 오버라이드 : 다양한 동작 

// 오버라이딩된 메소드는 업캐스팅이 되더라도 자식의 메소드대로 실행된다

class Figure {
	void draw() {
		System.out.println("도형을 그린다");
	}
}

class Triangle extends Figure {
	@Override
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

class Square extends Figure {
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Figure fig = new Figure();
		Triangle tri = new Triangle();
		Square sq = new Square();
		Circle cir = new Circle();
		
		Figure[] figs = new Figure[] { fig, tri, sq, cir };
		
		for(int i = 0; i <= figs.length;i++) {
			figs[i].draw();
		}

	}

}
