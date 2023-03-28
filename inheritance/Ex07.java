package inheritance;

import other.Herit;

class Airplane{

	private Herit[] sits = new Herit[5];
	
	void rideon(Herit tar) {
		for(int i = 0; i < sits.length; i++) {
			if (sits[i] == null) {
				sits[i] = tar;
				
				System.out.printf("%s ž��\n", tar.getName());
				return;
			}
		}
		System.out.println("���¼��� �� �̻� �����ϴ�");
	}
	
	void showList() {
		for(int i = 0; i < sits.length; i++) {
			System.out.print(i + 1 + "��° �¼� : ");
			
			if (sits[i] != null) {
				sits[i].showInfo();
			}
			else {
				System.out.println("--�� �¼�--");
			}
			
		}
	}
	
	void emergency(Herit sick) {
		
		for (int i = 0; i < sits.length; i++) {
			
			if (sits[i] instanceof Doctor) {
				System.out.println(i + 1 + "��°���� �ǻ� �߰�");
				
				((Doctor)sits[i]).cure(sick);
				return;
			}
			
		}
		System.out.println("�ǻ簡 �����ϴ�");
	}
	
	
}

public class Ex07 {

	public static void main(String[] args) {
		Herit per = new Herit("�̸�", 20);
		Student stu = new Student("ȫ�浿", 15, "����л�");
		Police pol = new Police("����ȣ", 27, "����");
		Doctor doc = new Doctor("���", 30, "����");
		
		Airplane air = new Airplane();
		
		air.rideon(per);
		air.rideon(stu);
		air.rideon(pol);
		air.rideon(doc);
		System.out.println();
		
		air.showList();
		System.out.println();
		
		air.emergency(stu);

	}

}
