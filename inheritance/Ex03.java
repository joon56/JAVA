package inheritance;

import other.Herit;

class Police extends Herit {
	private String grade;

	Police(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("%s (%d세, %s)\n", name, age, grade);
	}
	
	public void eat(String food) {
		System.out.printf("%s가 %s을 먹는다\n", name, food);
	}
	
	void patrol(String region) {
		System.out.printf("%s %s가 %s을 순찰한다\n", grade, name, region);
	}
	
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Police pol = new Police("이모씨", 29, "순경");
		
		pol.showInfo();
		pol.eat("빵");
		
		pol.patrol("해운대구");

	}

}
