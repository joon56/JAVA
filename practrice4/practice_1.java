import java.util.Scanner;

class showinfo {	// 인물의 신상 정보를 알려주는 클래스
	
	String name;	// 이름
	String dep;		// 학과
	String school;	// 학교
	
	showinfo(String name, String dep, String school) {	// 생성자 선언
		this.name = name;
		this.dep = dep;
		this.school = school;
	}
	
	String input() {	// A 경우 : input이 0일때
		return this.name + "학생 " + this.school + " " + this.dep + "학부"; // 입력이 없으니까 다 this()안에 걸로 처리된다
	}
	
	String input(String a) {	// B 경우 : input이 1일때 - 이름만 입력받음
		name = a;
		return this.name + "학생 " + this.school + " " + this.dep + "학부"; // 이름은 입력받은 걸로 나머지는 this()로
	}
	
	String input(String a, String b) {	// C 경우 : input 2일때 - 이름, 학과 입력받음
		name = a;
		dep = b;
		return this.name + "학생 " + this.school + " " + this.dep + "학부"; // 이름, 학과는 입력받은 걸로 나머지는 this()로
	}
	
	showinfo() {	// this()의 역할 : 입력받은게 없을 때 이를 대체하여 사용
		this("김자바", "프로그래밍", "연세대학교");
	}
	
	
}	

public class practice_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		showinfo me = new showinfo();	// showinfo자료형 변수
		String name, dep;
		
		System.out.println(me.input());	// 입력 안받는 경우
		
		System.out.println("\n<하나만 입력받는 경우>\n");
		System.out.println("이름만 입력하시오");
		System.out.print("이름 : ");
		name = sc.next();

		System.out.println(me.input(name));	// 이 이전에 저장된 값에 덮어쉬워져서 올바른 값이 나옴
		
		System.out.println("\n<두개 다 입력받는 경우>\n");
		System.out.println("이름과 학과를 모두 입력하시오");
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("학과 : ");
		dep = sc.next();
		
		System.out.println(me.input(name, dep));	// 위와 마찬가지
		
		sc.close();
		
		
	}

}
