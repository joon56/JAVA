package oop2;

class Po {
	int x;
	int y;
	
	void showpoint() {
		System.out.printf("(%d, d)입니다", x, y);
	}
	Po addpoint(Po p) {		// 애초에 메소드 생성을 하면 먼저 이걸 선언한게 this가 생성되서 this는이미 포함 되기 때문에 포함x
							// 클래를 선언하면서 메소드에 클래스형을 같이 선언 가능함
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
