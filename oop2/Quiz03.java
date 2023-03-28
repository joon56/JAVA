package oop2;

class Student {
	String name;
	int kor, math, eng;
	
	// 클래스 필드에 우클릭 누르고 source 들어가서 generating constructor using field 누르고 select all 하면 자동 생성자 초기화
	Student (String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	void showstu() {
		System.out.printf("%s (국 : %d, 수 : d, 영 : %d)\n", name, kor, math, eng);
	}
	
	int total() {
		return kor + math + eng;
	}
	double avg() {
		double result = total() / 3.0;
		result = Math.round(result);		// 그냥 Math.round 쓰면 소수 첫째자리 반올림 - (87.0) 
		// result = Math.round(result * 100);	괄호 안에 *10의 제곱수를 입력하면 해당 자리까지 반올림된 수가 나옴
		
		return result;
	}
	
}

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("홍길동", 70, 80, 90);
		
		stu.showstu();
		
		System.out.println(stu.total());
		System.out.println(stu.avg());
		
		
	}

}
