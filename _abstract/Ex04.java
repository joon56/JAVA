package _abstract;

import other.Animal;
import other.FlyAble;

// Ŭ������ ���
// - ������ ����� Ȯ���Ű�� ���� -> 'extends' ���

// �������̽��� ���
// - �ƹ��͵� ���� ���� �������̵带 �ؼ� ������ �ؾ��� -> 'implements'���
// - ���� ����� �����ϱ� ������ ��ĳ������ �����Ӵ�

class Bird extends Animal implements FlyAble {
	Bird(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println(name + "�̰� ±±");
		
	}

	@Override
	public void fly() {
		System.out.println(type + "�� ���ư���");
		
	}
	
		
}
class Airplane implements FlyAble {

	@Override
	public void fly() {
		System.out.println("�������� ���ư���");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		Cat cat = new Cat("����");
		Dog dog = new Dog("��Ű");
		Bird bird = new Bird("����");
		
		Animal[] ans = new Animal[] { cat, dog, bird };
		
		for (int i = 0; i < ans.length; i++) {
			ans[i].bark();
		}
		System.out.println();
		
		Airplane air = new Airplane();
		
		FlyAble[] flys = new FlyAble[] { bird, air };
		
		for (int i = 0; i < flys.length; i++) {
			flys[i].fly();
		}
		
	}

}
