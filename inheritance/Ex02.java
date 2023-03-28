package inheritance;

import other.Herit;

class Student extends Herit {
	
	private String school;

	// super(); - �θ� �����ڸ� ȣ���ϴ� Ű����, �ڵ����� ó����
	
	Student (String name, int age, String school) {
		super(name, age);		// �θ𿡰� �ִ� name�� age�� �״�� �ҷ����� ����
		this.school = school;	// school�� �ڽ��� ������ �����Ѱ��̱� ������ �ڽ� Ŭ������ ����
	}
	
	@Override					// �������̵� - �θ𲨿� ����Ѱ� �ִµ� �ڽĿ��� ����� �߰��� ��
	public void showInfo() {	// !!!! �߿� !!!! - ������ ���� �����ڵ� �Ȱ��� �ؾ��� (public, private��)
		//super.showInfo();		// �׳� super�� �ڽĲ�, 'super.'�� �θ𲨸� �ҷ����� ��
		
		//System.out.print(school);
		
		System.out.printf("%s (%d��, %s)\n", name, age, school); // �θ𿡼� private�ϸ� �̰� �ȵ�.
															  	  // protected ��� �ؼ� �Ǵ� ����
	}
	
	// �������̵� - �θ��� �޼ҵ带 �ٽ� ������ �ϴ� ��
	// �������̵�� �θ��� ���¸� �״�� �����;��� (����, ��ȯ��, �̸� �� �ϴ�)
	
	// �����ε� vs �������̵�
	// 1. �����ε� : ���� �̸��� �޼ҵ带 ���� �� �ۼ��ϴ� �� (�Ű����� �޸�)
	// 2. �������̵� : �θ��� �޼ҵ� ������
	
	void study(String sub) {
		System.out.printf("%s�� ������", sub);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		Herit p1 = new Herit("ȫ�浿", 22);
		
		p1.showInfo();
		p1.eat("����");
		System.out.println();
		
		
		Student stu = new Student("ȫ��ȣ", 16, "���л�");
		stu.showInfo();
	}

}
