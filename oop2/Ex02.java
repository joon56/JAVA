package oop2;

// 생성자 : 인스턴스 생성시 최초 한 번만 실행되는 메서드
// 주로 필드 초기화할 때 사용
// 생성자를 하나도 만들지 않으면 자바 컴파일러가 자동으로 하나 만들어준다
// 이를, 기본 생성자라고 한다

class Human {
	String name;
	int age;
	
	Human(String name, int a) {
		this.name = name;
		this.age = a;
	}
	
	Human(){
		name = "무명";
		age = -1;
	}
	
	Human(String name ){
		this.name = name;
		age = -1;
	}
	
	void showinfo() {
		System.out.printf("%s, %d세\n", name, age);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human h1 = new Human("홀길동", 30);
		Human h2 = new Human("김길동", 20);
		// 위에 개념 3번째 줄 - 이렇게 쓰려면 생성자를 만들어야함
		
		// Human h3 = new Human();
		// 이렇게 쓰려면 생성자가 필요한데  원래는  이걸 자바에서 줌 근데 생성자를 이미 생성을 했기 때문에 이거 컴팡리 안됨.
		
		 Human h4 = new Human();
		 
		 Human h5 = new Human("이순신");
		 
		h1.showinfo();
		
		h2.showinfo();
		
		h4.showinfo();
		
		h5.showinfo();
	}

}
