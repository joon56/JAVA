package other;

// public class�� �� Ŭ������ �̸��̱� ������ �� Ŭ���� �ȿ� public class�� ������ ���� �� ����
// public class�� �ΰ� �̻� �����Ϸ��� �ٸ� Ŭ������ ���� �����ؾ���
public class Person {
	public String name;
	int age;
	// private double height;
	
	
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		// this.height = height;
	}

	// �Լ��� ����� ������ ������ ����
	// ������ �̾ȿ� �ִ� ���� pakage other�̶�� pakage������ ��������
	// �׷��� ������ public ���� ������ ����� �ٸ������� ��밡����
	public void show() {
		
	}

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 20, 123.1);
		
		p1.show();

	}

}
