package accessmodifier;

// access method
// - private ����� �����ϰ��ϴ� �޼���
// - getter, setter�ϰ� �Ѵ�

class People {
	private String name;
	private int age;
	
	
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public void showinfo() {
		System.out.printf("%s %d��\n\n", name, age);
	}
	
	String getName() {		// access�޼ҵ�
		return name;
	}
	 // getName���� return ������ private ���� ����
	// �׷��� p1.getName() = "ȫ��ȣ" �̷���  �ȵ� -> getter set�� �׳� ���⸸�ϴ� �뵵�̱� �����̴�.
	// getter�� ������ �ٲٴ°� �Ұ��� ���� �ϱ� ����

	
	void setName(String name) {
		this.name = name;
	}
	// setter�� ���޹��� ������ �ʵ带 ����
	// getter�ʹ� �ٸ��� ���� ���游 ������ -> �б� �Ұ���
	
	
	// access�޼ҵ���� ������ �ۼ��� �ʿ�� ����
	// �ʿ��� ��쿡�� ����� �ȴ�.
	
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		People p1 = new People("ȫ�浿", 26);
		
		p1.showinfo();
		
		// p1.name = "ȫ��ȣ";
		// ���� ������ - private�� ��� �Ұ���
		
		System.out.println( p1.getName()); 
		
		p1.setAge(24);
		System.out.println(p1.getAge());
		
		p1.showinfo();
	}

}
