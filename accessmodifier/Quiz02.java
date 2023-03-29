package accessmodifier;



class Ball {
	private String type;

	Ball(String type) {
		this.setType(type);
	}
	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}
	
	
}
class Child {
	private String name;
	private Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showinfo() {
		String type = (ball == null) ? "x" : ball.getType();
		System.out.printf("%s (공 : %s)\n", name, type);
	}
	
	void takeball(Ball a) {
		this.ball = a;
		
		System.out.printf("%s가 %s를 얻었다\n\n", name, ball.getType());
	}
	
	void throwball(Child n) {
		System.out.printf("%s가 %s에게 %s을 던짐\n\n", this.name, n.name, ball.getType());
		
		n.ball = this.ball;
		this.ball = null;
		
	}
	String getName() {
		return name;
	}
	
}

public class Quiz02 {

	public static void main(String[] args) {
		
		Child minsu = new Child("민수");
		Child jimin = new Child("지민");
		
		Ball base = new Ball("야구공");
		
		minsu.showinfo();
		jimin.showinfo();
		System.out.println();
		
		minsu.takeball(base);
		minsu.showinfo();
		jimin.showinfo();
		System.out.println();
		
		minsu.throwball(jimin);
		minsu.showinfo();
		jimin.showinfo();
		System.out.println();
		
		jimin.throwball(minsu);
		minsu.showinfo();
		jimin.showinfo();
		
		

	}

}
