package accessmodifier;

// ���� ���� ������ : Ŭ������ ����� �����ϴ� ������ �����ϴ� Ű����
// 1. private : Ŭ���� ���ο����� ���� ����
// 2. pakage : ���� + ���� ��Ű������ ���� ����
// 3. protected : ���� + ��Ű�� + ��ӹ��� �ڽ� Ŭ�������� ���� ����
// 4. public : �� + ��Ű�� + ��� + �ܺ�, ��𼭵� ���� ����

// pakage�¾ƹ��͵� ������������ ����

import other.Person;
// �ٸ� ��Ű���� �ִ� Ŭ������ import�ؼ� ��� ����



public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22, 172.2);
		
		p1.name = "ȫ��ȣ";
		// p1.age = 20;
		// p1.height = 170.3;
		// - private�� �ش� Ŭ���� ����� ��� �Ұ���
		
		p1.show();

	}

}
