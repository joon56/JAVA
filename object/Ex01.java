package object;

// �ڹ��� �ֻ��� Ŭ���� > object
// - ��� Ŭ�������� object�� ��� ����

// ���� ��� Ŭ�������� �� �� ĳ������ ������.

// �׳� ���Ƿ� class Person�� ����� extends Object�� �����Ǽ� ����

class Student extends Object {	// ����� ���� �ʴ� class�� �ڵ����� �̰� �����
	private String name;
	private int age;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
		public String toString() {
		
			String result = String.format("%s (%d��)", name, age);
			// .format�� ���� ���ڿ��� ���� ����!!
			
			return result;
			// ������ return���� �޾����� �ؾ���
		}

	// source���� hashcode() equals �ڵ��ϼ�----------���� ���� X
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		if (this == obj)	// ���� ����� �����ϴ���
			return true;
		
		if (obj == null)	// �� ����� �ִ��� ������
			return false;
		
		if (getClass() != obj.getClass())	// �� Ŭ������ ������
			return false;
		
		Student other = (Student) obj;	// ��� �񱳸� ���� down casting
		
		if (age != other.age)	// ���̰� �ٸ���
			return false;
		
		if (name == null) {		// �̸��� null����
			if (other.name != null)		// ����� �̸��� null�� �ƴ���
				return false;
		}
		else if (!name.equals(other.name))	// �̸��� �ٸ���
			return false;
		
		return true;
		*/
		
		// ������ �ص� �ǰ� �̷��� �ص� ��
		// �� ���ϴ� �ڵ�
		Student tar = (Student) obj;
		
		if (name.equals(tar.name) && age == tar.age) {
			return true;
		}
		return false;
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Student p1 = new Student("ȫ�浿", 17);
		Student p2 = new Student("ȫ�浿", 17);
		Student p3 = p1;
		
		System.out.println(p1);
		System.out.println(p1.toString());
		// �׳� object�� �ִ� to string�� �̿��ϸ� �ؽ��ڵ� ��
		// override�� �ϸ� ���� ������ ���ϴ����·� ��� ����
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		// .equals�� ���� ���� ���� ���°� �ƴ϶� �����ϴ°� �������� ���� ��!!

	}

}
