package _interface;

import java.util.Arrays;
import java.util.Comparator;

// Comparable
// Ŭ������ ��� �޾Ƽ� ����ϴ� �������̽�
// �ش� Ŭ������ �⺻ �� ������ �ȴ�

// Comparator
// �ȿ� �ִ� compare()��� �޼��带 ���
// �ַ� �ٸ� �� ������ ����ϰ� ���� �� ���

class Person implements Comparable<Person> {
	 private String name;
	 private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return getName() + "(" + age + ")";
	}

	@Override
	public int compareTo(Person o) {
		// this�� o1 ����, o�� o2 ����
		
		return o.age - age;
	}
	
	public String getName() {
		return name;
	}
	
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Person[] pers = new Person[] {
				new Person("ȫ�浿", 23),
				new Person("��浿", 40),
				new Person("�̱浿", 17)
		};
		
		System.out.println("���� �� : " + Arrays.toString(pers));
		
		// sort�� Comperator�� �������� ����
		// -> Comperable�� ����ؼ� ��
		Arrays.sort(pers);
		System.out.println("���� �� : " + Arrays.toString(pers));
		
		
		Comparator<Person> nameasc = (Person o1, Person o2) -> {
			return o1.getName().compareTo(o2.getName());
		};
		
		// Comperator�� �����ϸ� 
		// Comperable ��� ������ ��ü�� ��
		Arrays.sort(pers, nameasc);
		System.out.println("���� �� : " + Arrays.toString(pers));
		
		
	}

}
