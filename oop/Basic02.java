package oop;

class Person{
	// 1. 필드 : 멤버 변수로 표현
	String name;
	int age;
	
	// 2. 메서드 : 멤버 변수로 표현
	
	void show() {		// 실제로는 void show(Person this)임
						// 그래서 밑에서 p.show(); 하면 어짜피 겹치는거 없으니까 this 때고 main에서 넣은 값 실행 
		
		
		// System.out.printf(this.name, this.age);
		
		System.out.printf("%s (%d)", name, age);
		// - 지역 변수와 멤버 변수의 이름이 같을 시 값이 겹치지 않으면 this 생략 가능
	}
	void eat(String food) {		// = void eat(Person this, String food)
		
		String result = "%s이가 %s을 먹는다";
		
		System.out.printf(result, name, food);
	}
}
// 구조체 개념에서 함수만 추가된 느낌

public class Basic02 {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "홍길동";  // 객체의 인스턴스의 멤버 접근시
		p.age = 23;		  // 참조 변수의 . 연산자 사용
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		p.show();
		
		System.out.println();
		
		p.eat("치킨");	// eat(p, "치킨")
	}
}
