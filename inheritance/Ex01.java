package inheritance;

// ��� : ������ �ۼ��� Ŭ������ ������ �����޾Ƽ� ���ο� Ŭ������ �ۼ��ϴ� ���

// ����� ���ִ� Ŭ���� : �θ�, ����, ����, ��� Ŭ����
// ����� �޴� Ŭ���� : �ڽ�, ����, ����, �Ļ� Ŭ����

class Super {
	int supNum = 10;
	
	void showSuper() {
		System.out.println("�θ��� �޼ҵ��Դϴ�.");
	}
}

class Sub  extends Super{
	int subNum = 30;
	
	void showSub() {
		System.out.println("�ڽ��� �޼ҵ��Դϴ�.");
	}
}


public class Ex01 {
		public static void main(String[] args) {
			Super sup = new Super();
			
			System.out.println("sup �ʵ� : " + sup.supNum);
			sup.showSuper();
			
			
			// �θ�� �ڽĿ��� ������ ����� ��
			// �ڽ��� �θ� + �ڽŲ� �� �� �� ����
			// System.out.println("sup �ʵ� : " + sub.supNum);
			
			
			
			Sub sub = new Sub();
			
			System.out.println("\nsub�ʵ� : " + sub.subNum);
			
			sub.showSuper();
			sub.showSub();
		}
}
