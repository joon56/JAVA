package intaraction;

class Ball {
	String type;

	 Ball(String type) {
		
		this.type = type;
	}
	
	
}

class kid {
	String name;
	Ball ball;
	
	kid(String name) {
		
		this.name = name;
	}

	void showinfo() {
		String type = (ball == null) ? "x" : ball.type;
		System.out.printf("%s(�� : %s)\n", name, type);
	}
	
	void takeball(Ball a) {
		this.ball = a;
	}
	
	void throwball(kid n) {
		System.out.printf("%s�� %s���� %s�� ����\n", this.name, n.name, ball.type);
		
		n.ball = this.ball;
		this.ball = null;
		
	}
	
		
	
}

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kid minsu = new kid("�μ�");
		kid jimin = new kid("����");
		
		minsu.showinfo();
		jimin.showinfo();
		System.out.println();
		
		Ball base = new Ball("�߱���");
		
		minsu.takeball(base);
		
		minsu.showinfo();
		jimin.showinfo();
		System.out.println();
		
		minsu.throwball(jimin);
		System.out.println();
		
		minsu.showinfo();
		jimin.showinfo();
	}

}
