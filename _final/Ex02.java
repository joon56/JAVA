package _final;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	final void eat(String food) {
		System.out.printf("\n%s�� %s�� �Դ´�\n", name, food);
	}
	
	
}

class Student extends Person {
	String grade;

	Student(String name, String grade) {
		super(name);
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(" + grade + ")";
	}
	
	/*	final�� �����Ǹ� ����� ������ �������̵尡 �ȵȴ�.
	 * @Override 
	 * void eat(String food) { 
	 * System.out.println("���� ���� �ʽ��ϴ�."); 
	 * }
	 */
	
}

// class college extends Student - ���� Student�� final�� �Ǹ� ����� �Ұ����� Ŭ������ ����



public class Ex02 {

	public static void main(String[] args) {
		
		Person per = new Person("ȫ�浿");
		
		System.out.println(per);
		
		per.eat("����");
		
		Student stu = new Student("��浿", "����л�");
		
		System.out.println(stu);
		stu.eat("���");

	}

}
