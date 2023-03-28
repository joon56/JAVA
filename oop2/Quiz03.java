package oop2;

class Student {
	String name;
	int kor, math, eng;
	
	// Ŭ���� �ʵ忡 ��Ŭ�� ������ source ���� generating constructor using field ������ select all �ϸ� �ڵ� ������ �ʱ�ȭ
	Student (String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	void showstu() {
		System.out.printf("%s (�� : %d, �� : d, �� : %d)\n", name, kor, math, eng);
	}
	
	int total() {
		return kor + math + eng;
	}
	double avg() {
		double result = total() / 3.0;
		result = Math.round(result);		// �׳� Math.round ���� �Ҽ� ù°�ڸ� �ݿø� - (87.0) 
		// result = Math.round(result * 100);	��ȣ �ȿ� *10�� �������� �Է��ϸ� �ش� �ڸ����� �ݿø��� ���� ����
		
		return result;
	}
	
}

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("ȫ�浿", 70, 80, 90);
		
		stu.showstu();
		
		System.out.println(stu.total());
		System.out.println(stu.avg());
		
		
	}

}
