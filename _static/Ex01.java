package _static;

class Person {
	// �Ϲ� ��� : �ν��Ͻ����� �����ϰ� ������ ����
	// - �ν��Ͻ� ��� 
	String name;
	int age;
	
	// ���� ��� : �ν��Ͻ��� �����ϴ� ����
	// Ŭ���� ��ü�� ������ ����
	static int eyes = 2;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showinfo() {
		System.out.printf("%s (%d��, %d)\n\n", name, age, eyes);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("����� ���� ������ : " + Person.eyes);
		
		Person p1 = new Person("ȫ�浿", 23);
		Person p2 = new Person("��浿", 21);
		Person p3 = new Person("��浿", 30);
		
		// p1.eyes = 3;
		Person.eyes = 3;	// eyes�� PersonŬ������ �����
							// �����Ҵ� �Ǿ��ִٰ� �ص� Ŭ������ �����Ͽ� �ٲٸ� �ٲ���
		p1.showinfo();
		p2.showinfo();
		p3.showinfo();
	}

}
