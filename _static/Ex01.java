package _static;

class Person {
	// 일반 멤버 : 인스턴스마다 고유하게 가지는 공간
	// - 인스턴스 멤버 
	String name;
	int age;
	
	// 정적 멤버 : 인스턴스가 공유하는 공간
	// 클래스 자체가 가지는 공간
	static int eyes = 2;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showinfo() {
		System.out.printf("%s (%d세, %d)\n\n", name, age, eyes);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("사람의 눈의 개수는 : " + Person.eyes);
		
		Person p1 = new Person("홍길동", 23);
		Person p2 = new Person("김길동", 21);
		Person p3 = new Person("빅길동", 30);
		
		// p1.eyes = 3;
		Person.eyes = 3;	// eyes는 Person클래스의 멤버임
							// 정적할당 되어있다고 해도 클래스에 접근하여 바꾸면 바꿔짐
		p1.showinfo();
		p2.showinfo();
		p3.showinfo();
	}

}
