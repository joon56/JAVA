package oop;

// class Person
// Ŭ������ ���� ��Ű�� �ȿ��� ���� ��
// ���Ӱ� ���� �̸����� ����� �� �ȵ����� main���� Person�� ���Ѱ� ������ �� ����

// this�� �ʿ��� ���� = �ν��Ͻ��� �����ϱ� ���ؼ�!!!!!!!!!!!!

public class Basic03 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "ȫ�浿";
		p1.age = 20;
		
		p2.name = "������";
		p2.age = 30;
		
		p1.show();
		p2.show();
		
		p1.eat("����");
		p2.eat("����");
	}

}
