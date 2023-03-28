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
		System.out.printf("%s (%d��, %s)\n", name, age, grade);
	}
	
	public void eat(String food) {
		System.out.printf("%s�� %s�� �Դ´�\n", name, food);
	}
	
	void patrol(String region) {
		System.out.printf("%s %s�� %s�� �����Ѵ�\n", grade, name, region);
	}
	
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Police pol = new Police("�̸�", 29, "����");
		
		pol.showInfo();
		pol.eat("��");
		
		pol.patrol("�ؿ�뱸");

	}

}
