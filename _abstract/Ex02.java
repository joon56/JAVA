package _abstract;

import other.*;

class Square extends Figure {

	@Override
	public void draw() {
		
		System.out.println("�簢���� �׸���");
	}
	
}

class Circle extends Figure {

	@Override
	public void draw() {
		
		System.out.println("���� �׸���");
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
			// �θ� �޼��忡�� draw�� �����Ǿ� ���� ������ �ڵ����� �ڽĲ� �����ͼ� ����
		}
	}

}
