import java.util.Scanner;

class showinfo {	// �ι��� �Ż� ������ �˷��ִ� Ŭ����
	
	String name;	// �̸�
	String dep;		// �а�
	String school;	// �б�
	
	showinfo(String name, String dep, String school) {	// ������ ����
		this.name = name;
		this.dep = dep;
		this.school = school;
	}
	
	String input() {	// A ��� : input�� 0�϶�
		return this.name + "�л� " + this.school + " " + this.dep + "�к�"; // �Է��� �����ϱ� �� this()�ȿ� �ɷ� ó���ȴ�
	}
	
	String input(String a) {	// B ��� : input�� 1�϶� - �̸��� �Է¹���
		name = a;
		return this.name + "�л� " + this.school + " " + this.dep + "�к�"; // �̸��� �Է¹��� �ɷ� �������� this()��
	}
	
	String input(String a, String b) {	// C ��� : input 2�϶� - �̸�, �а� �Է¹���
		name = a;
		dep = b;
		return this.name + "�л� " + this.school + " " + this.dep + "�к�"; // �̸�, �а��� �Է¹��� �ɷ� �������� this()��
	}
	
	showinfo() {	// this()�� ���� : �Է¹����� ���� �� �̸� ��ü�Ͽ� ���
		this("���ڹ�", "���α׷���", "�������б�");
	}
	
	
}	

public class practice_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		showinfo me = new showinfo();	// showinfo�ڷ��� ����
		String name, dep;
		
		System.out.println(me.input());	// �Է� �ȹ޴� ���
		
		System.out.println("\n<�ϳ��� �Է¹޴� ���>\n");
		System.out.println("�̸��� �Է��Ͻÿ�");
		System.out.print("�̸� : ");
		name = sc.next();

		System.out.println(me.input(name));	// �� ������ ����� ���� ��������� �ùٸ� ���� ����
		
		System.out.println("\n<�ΰ� �� �Է¹޴� ���>\n");
		System.out.println("�̸��� �а��� ��� �Է��Ͻÿ�");
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.print("�а� : ");
		dep = sc.next();
		
		System.out.println(me.input(name, dep));	// ���� ��������
		
		sc.close();
		
		
	}

}
