package oop2;

class Po {
	int x;
	int y;
	
	void showpoint() {
		System.out.printf("(%d, d)�Դϴ�", x, y);
	}
	Po addpoint(Po p) {		// ���ʿ� �޼ҵ� ������ �ϸ� ���� �̰� �����Ѱ� this�� �����Ǽ� this���̹� ���� �Ǳ� ������ ����x
							// Ŭ���� �����ϸ鼭 �޼ҵ忡 Ŭ�������� ���� ���� ������
		Po temp = new Po();
		
		temp.x = this.x + p.x;
		temp.y = this.y + p.y;
		
		return temp;
	}
}

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Po p1 = new Po();
		Po p2 = new Po();
		
		p1.x = 6;
		p1.y = 3;
		
		p2.x = 1;
		p2.y = 4;
		
		p1.showpoint();
		p2.showpoint();
		
		Po p3 = p1.addpoint(p2);
		
		p3.showpoint();
	}

}
