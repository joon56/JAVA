package inheritance;

import other.Herit;

// 클래스 간에도 형변환이 가능하다
// 단, 상속관계일 때만

public class Ex04 {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", 17, "고등학생");
		
		// 자식의 인스턴스를 부모꺼로 참조 ( 업 캐스팅 )
		// 학생을 사람이라고 취급하고 있다
		Herit per = new Student("홍길동", 17, "고등학생");
		
		stu1.showInfo();
		per.showInfo();
		
		stu1.study("수학");
		// per.study("국어");  얘는 부모 클래스를 기반으로 선언이 되서 자식에서 고유하게 만들어진 메소드는 인식 못함
		
		// 업캐스팅이 되면 자식의 메소드들은 사용이 불가능하다
		// 업캐스팅을 사용하는 이유는 자식 클래스다 여러개 생성되었을 때 이들을 모두 묶어 한 번에 처리하기 위함
		// 즉, 경찰, 의사, 학생들을 한 번에 사람이라는 부모 클래스로 처리하기 위함
		
		// 업캐스팅 된 객체를 원래대로 돌려주는 과정을 '다운 캐스팅'이라고 함
		
		((Student)per).study("java");	// 괄호 두 번 치는 이유
		// Student로 묶인 per이 변형된거 자체를 받아주는 것이기 때문에 두 번
		
		Student tmp = (Student)per;		// 방식 2
		tmp.study("java");
	}

}
