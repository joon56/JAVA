package inheritance;

import other.Herit;



public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Herit per = new Herit("�̸�", 20);
		Student stu = new Student("ȫ�浿", 15, "����л�");
		Police pol = new Police("����ȣ", 27, "����");
		Doctor doc = new Doctor("���", 30, "����");
		
		
		Herit[] peo = new Herit[] { per, stu, pol, doc };
		
		peo[0].showInfo();
		peo[3].showInfo();
		// �Ȱ��� Herit�� �����µ� �� �ڽ� Ŭ������ �͵� ����Ǵ°�?
		// Herit�� ������ ������ �Ȱ� �ڽ��� Ŭ���� ���̶�� �װ� ������� �ؼ�!!
		// <������> �����ϴµ� ����
		
		// ((Doctor(peo[2])).cure(stu); police�� doctor�� �ƴ϶� �ȵ�.
		
		// �ٿ� ĳ������ �� �� ������ Ÿ�԰� �ٸ��� ���� ������ �߻���
		// �̸� �Ǻ��ϴ� 'instanceof'��� Ű���尡 �ִ�
		
		System.out.println();
		
		System.out.println(peo[3] instanceof Doctor);
		// ������ ��, true, false
		
		System.out.println(peo[2] instanceof Police);
		
		System.out.println(peo[2] instanceof Student);
		
		

	}

}
