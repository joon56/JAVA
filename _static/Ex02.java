package _static;

class Human {
	private String name;
	private int age;
	
	private static int eyes = 2;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void show() {						// this., this., Human. ����
		System.out.printf("%s (%d�� %d)\n\n", name, age, eyes);
	}
	
	static int getEyes() {	// ���⿡�� this�� ����
		return eyes;
	}
	static void setEyes(int eyes) {
		Human.eyes = eyes;	// static ����� �ν��Ͻ� ������ �ʱ� ������ this ����
							// �ٲ��ַ��� Ŭ���� �̸��� �־��ָ� �ȴ�
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("����� �� ���� : " + Human.getEyes());
		
		Human h1 = new Human("ȫ�浿", 23);
		Human h2 = new Human("��浿", 16);
		Human h3 = new Human("�ڱ浿", 30);
		
		Human.setEyes(3);
		
		h1.show();
		h2.show();
		h3.show();

	}

}
