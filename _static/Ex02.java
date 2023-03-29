package _static;

class Human {
	private String name;
	private int age;
	
	private static int eyes = 2;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void show() {						// this., this., Human. 생략
		System.out.printf("%s (%d세 %d)\n\n", name, age, eyes);
	}
	
	static int getEyes() {	// 여기에는 this가 없음
		return eyes;
	}
	static void setEyes(int eyes) {
		Human.eyes = eyes;	// static 멤버는 인스턴스 가지지 않기 때문에 this 없고
							// 바꿔주려면 클래스 이름을 넣어주면 된다
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("사람의 눈 개수 : " + Human.getEyes());
		
		Human h1 = new Human("홍길동", 23);
		Human h2 = new Human("김길동", 16);
		Human h3 = new Human("박길동", 30);
		
		Human.setEyes(3);
		
		h1.show();
		h2.show();
		h3.show();

	}

}
