package oop2;

class Person {
	String name;
	int age;
	double height;
	
	void showinfo() {
		System.out.printf("%s, %d��, %fcm", name, age, height);
	}
	
	void study(String sub) {
		System.out.printf("%s ������");
	}
}



public class Ex01 {


	public static void main(String[] args) {
		Person p; // ���� ���� : ����� ����Ű���� �ϴ� ��
		
		p = new Person(); // new�� ������� ����
		
		p.name = "ȫ�浿";
		p.age = 20;
		p.height = 160.5;
		
		p.showinfo();
		
		p.study("Java");
	}

}
