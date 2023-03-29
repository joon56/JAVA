package accessmodifier;

// 접근 제어 지시자 : 클래스에 멤버에 접근하는 정도를 지정하는 키워드
// 1. private : 클래스 내부에서만 접근 가능
// 2. pakage : 내부 + 같은 패키지까지 접근 가능
// 3. protected : 내부 + 패키지 + 상속받은 자식 클래스까지 접근 가능
// 4. public : 냅 + 패키지 + 상속 + 외부, 어디서든 접근 가능

// pakage는아무것도 지정하지않은 상태

import other.Person;
// 다른 패키지에 있는 클래스는 import해서 사용 가능



public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 22, 172.2);
		
		p1.name = "홍진호";
		// p1.age = 20;
		// p1.height = 170.3;
		// - private는 해당 클래스 벗어나면 사용 불가능
		
		p1.show();

	}

}
