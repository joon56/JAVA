package oop;

class Person{
	// 1. �ʵ� : ��� ������ ǥ��
	String name;
	int age;
	
	// 2. �޼��� : ��� ������ ǥ��
	
	void show() {		// �����δ� void show(Person this)��
						// �׷��� �ؿ��� p.show(); �ϸ� ��¥�� ��ġ�°� �����ϱ� this ���� main���� ���� �� ���� 
		
		
		// System.out.printf(this.name, this.age);
		
		System.out.printf("%s (%d)", name, age);
		// - ���� ������ ��� ������ �̸��� ���� �� ���� ��ġ�� ������ this ���� ����
	}
	void eat(String food) {		// = void eat(Person this, String food)
		
		String result = "%s�̰� %s�� �Դ´�";
		
		System.out.printf(result, name, food);
	}
}
// ����ü ���信�� �Լ��� �߰��� ����

public class Basic02 {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "ȫ�浿";  // ��ü�� �ν��Ͻ��� ��� ���ٽ�
		p.age = 23;		  // ���� ������ . ������ ���
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		p.show();
		
		System.out.println();
		
		p.eat("ġŲ");	// eat(p, "ġŲ")
	}
}
