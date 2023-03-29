package _abstract;

import other.*;

class Square extends Figure {

	@Override
	public void draw() {
		
		System.out.println("사각형을 그린다");
	}
	
}

class Circle extends Figure {

	@Override
	public void draw() {
		
		System.out.println("원을 그린다");
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		Square sq = new Square();
		Circle cir = new Circle();
		
		Figure[] figs = new Figure[] { tri, sq, cir };
		
		for (int i = 0; i < figs.length; i++) {
			figs[i].draw();
			// 부모 메서드에는 draw가 구현되어 있지 않지만 자동으로 자식꺼 가져와서 실행
		}
	}

}
