package inheritance;

import other.Herit;

class Student extends Herit {
	
	private String school;

	// super(); - 부모 생성자를 호출하는 키워드, 자동으로 처리됨
	
	Student (String name, int age, String school) {
		super(name, age);		// 부모에게 있는 name과 age를 그대로 불러오는 과정
		this.school = school;	// school은 자식이 가지는 고유한거이기 때문에 자식 클래스에 선언
	}
	
	@Override					// 오버라이드 - 부모꺼에 비슷한게 있는데 자식에서 기능을 추가할 때
	public void showInfo() {	// !!!! 중요 !!!! - 무조건 접근 지시자도 똑같이 해야함 (public, private등)
		//super.showInfo();		// 그냥 super은 자식꺼, 'super.'은 부모꺼를 불러오는 것
		
		//System.out.print(school);
		
		System.out.printf("%s (%d세, %s)\n", name, age, school); // 부모에서 private하면 이거 안됨.
															  	  // protected 라고 해서 되는 거임
	}
	
	// 오버라이드 - 부모의 메소드를 다시 재정의 하는 것
	// 오버라이드시 부모의 형태를 그대로 가져와야함 (접근, 반환값, 이름 등 싹다)
	
	// 오버로드 vs 오버라이드
	// 1. 오버로드 : 같은 이름의 메소드를 여러 개 작성하는 법 (매개변수 달리)
	// 2. 오버라이드 : 부모의 메소드 재정의
	
	void study(String sub) {
		System.out.printf("%s를 공부중", sub);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		Herit p1 = new Herit("홍길동", 22);
		
		p1.showInfo();
		p1.eat("피자");
		System.out.println();
		
		
		Student stu = new Student("홍진호", 16, "중학생");
		stu.showInfo();
	}

}
