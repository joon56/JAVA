package oop2;

// ������ : �ν��Ͻ� ������ ���� �� ���� ����Ǵ� �޼���
// �ַ� �ʵ� �ʱ�ȭ�� �� ���
// �����ڸ� �ϳ��� ������ ������ �ڹ� �����Ϸ��� �ڵ����� �ϳ� ������ش�
// �̸�, �⺻ �����ڶ�� �Ѵ�

class Human {
	String name;
	int age;
	
	Human(String name, int a) {
		this.name = name;
		this.age = a;
	}
	
	Human(){
		name = "����";
		age = -1;
	}
	
	Human(String name ){
		this.name = name;
		age = -1;
	}
	
	void showinfo() {
		System.out.printf("%s, %d��\n", name, age);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human h1 = new Human("Ȧ�浿", 30);
		Human h2 = new Human("��浿", 20);
		// ���� ���� 3��° �� - �̷��� ������ �����ڸ� ��������
		
		// Human h3 = new Human();
		// �̷��� ������ �����ڰ� �ʿ��ѵ�  ������  �̰� �ڹٿ��� �� �ٵ� �����ڸ� �̹� ������ �߱� ������ �̰� ���θ� �ȵ�.
		
		 Human h4 = new Human();
		 
		 Human h5 = new Human("�̼���");
		 
		h1.showinfo();
		
		h2.showinfo();
		
		h4.showinfo();
		
		h5.showinfo();
	}

}
