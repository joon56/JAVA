package oop2;

class Person {
	String name;
	int age;
	double height;
	
	void showinfo() {
		System.out.printf("%s, %d세, %fcm", name, age, height);
	}
	
	void study(String sub) {
		System.out.printf("%s 공부중");
	}
}



public class Ex01 {


	public static void main(String[] args) {
		Person p; // 참조 변수 : 대상을 가리키려고 하는 것
		
		p = new Person(); // new로 만들어진 공간
		
		p.name = "홍길동";
		p.age = 20;
		p.height = 160.5;
		
		p.showinfo();
		
		p.study("Java");
	}

}
