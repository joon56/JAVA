package inheritance;

import other.Herit;

class Airplane{

	private Herit[] sits = new Herit[5];
	
	void rideon(Herit tar) {
		for(int i = 0; i < sits.length; i++) {
			if (sits[i] == null) {
				sits[i] = tar;
				
				System.out.printf("%s 탑승\n", tar.getName());
				return;
			}
		}
		System.out.println("빈좌석이 더 이상 없습니다");
	}
	
	void showList() {
		for(int i = 0; i < sits.length; i++) {
			System.out.print(i + 1 + "번째 좌석 : ");
			
			if (sits[i] != null) {
				sits[i].showInfo();
			}
			else {
				System.out.println("--빈 좌석--");
			}
			
		}
	}
	
	void emergency(Herit sick) {
		
		for (int i = 0; i < sits.length; i++) {
			
			if (sits[i] instanceof Doctor) {
				System.out.println(i + 1 + "번째에서 의사 발견");
				
				((Doctor)sits[i]).cure(sick);
				return;
			}
			
		}
		System.out.println("의사가 없습니다");
	}
	
	
}

public class Ex07 {

	public static void main(String[] args) {
		Herit per = new Herit("이모씨", 20);
		Student stu = new Student("홍길동", 15, "고등학생");
		Police pol = new Police("이진호", 27, "경위");
		Doctor doc = new Doctor("김모씨", 30, "내과");
		
		Airplane air = new Airplane();
		
		air.rideon(per);
		air.rideon(stu);
		air.rideon(pol);
		air.rideon(doc);
		System.out.println();
		
		air.showList();
		System.out.println();
		
		air.emergency(stu);

	}

}
