package poly;

// ������ : �پ��� ���¸� ������ �ǹ�
// �ϳ��� ������� �������� ����� �����ϱ� ���� ���

// �������� �����ϱ� ����  ����
// 1. ��Ӱ��� : �ڽİ�ü�� ��� ó���ϱ� ����
// 2. �������̵� : �پ��� ���� 

// �������̵��� �޼ҵ�� ��ĳ������ �Ǵ��� �ڽ��� �޼ҵ��� ����ȴ�

class Figure {
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Triangle extends Figure {
	@Override
	void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
}

class Square extends Figure {
	@Override
	void draw() {
		System.out.println("�簢���� �׸���");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("���� �׸���");
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
