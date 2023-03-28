package inheritance;

import other.Herit;

class Doctor extends Herit {
	private String major;

	Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override
	public void showInfo() {
		System.out.printf("%s (%d��, %s)", name, age, major);
	}
	
	
	// Herit�� ��ӹ��� Ŭ������ ��� ���⿡ �޾���
	void cure(Herit person) {		// �� ĳ����
		System.out.printf("%s�� %s�� %s�� ġ���ߴ�", major, name, person.getName());
	}
	
	
	
	
}

public class Ex05 {

	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿", 15, "����л�");
		Police pol = new Police("����ȣ", 27, "����");
		Doctor doc = new Doctor("���", 30, "����");
		
		doc.showInfo();
		
		doc.cure(stu);
		doc.cure(pol);

	}

}
