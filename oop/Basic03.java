package oop;

// class Person
// 클래스는 같은 패키지 안에서 공유 됨
// 새롭게 같은 이름으로 만드는 건 안되지만 main에서 Person에 관한건 실행할 수 있음

// this가 필요한 이유 = 인스턴스를 구분하기 위해서!!!!!!!!!!!!

public class Basic03 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "홍길동";
		p1.age = 20;
		
		p2.name = "유민준";
		p2.age = 30;
		
		p1.show();
		p2.show();
		
		p1.eat("보쌈");
		p2.eat("족발");
	}

}
