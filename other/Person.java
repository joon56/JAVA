package other;

// public class는 이 클래스의 이름이기 때문에 한 클래스 안에 public class를 여러개 만들 수 없음
// public class를 두개 이상 생성하려면 다른 클래스를 따로 생성해야함
public class Person {
	public String name;
	int age;
	// private double height;
	
	
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		// this.height = height;
	}

	// 함수도 멤버라서 범위의 영향을 받음
	// 원래는 이안에 있는 모든게 pakage other이라는 pakage형으로 묶여있음
	// 그래서 개별로 public 으로 선언을 해줘야 다른데에서 사용가능함
	public void show() {
		
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20, 123.1);
		
		p1.show();

	}

}
