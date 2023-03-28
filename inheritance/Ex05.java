package inheritance;

import other.Herit;

class Doctor extends Herit {
	private String major;

	Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override
	public void showInfo() {
		System.out.printf("%s (%d세, %s)", name, age, major);
	}
	
	
	// Herit를 상속받은 클래스는 모두 여기에 받아짐
	void cure(Herit person) {		// 업 캐스팅
		System.out.printf("%s의 %s이 %s을 치료했다", major, name, person.getName());
	}
	
	
	
	
}

public class Ex05 {

	public static void main(String[] args) {
		Student stu = new Student("홍길동", 15, "고등학생");
		Police pol = new Police("이진호", 27, "경위");
		Doctor doc = new Doctor("김모씨", 30, "내과");
		
		doc.showInfo();
		
		doc.cure(stu);
		doc.cure(pol);

	}

}
