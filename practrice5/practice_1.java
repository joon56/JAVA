
public class practice_1 {
	int a = 5; // Ŭ���� ������ ����
	
	public void call() { // Ŭ���� ������ �޼ҵ�
		System.out.println("call method");
	}

	public static void main(String[] args) {
		// static�� ���� ��쿡�� ��üȭ�� �ؾ���
		practice_1 nst = new practice_1(); // ��üȭ
		System.out.println(nst.a);
		nst.call(); // ��üȭ�� �ؾ��ϴ� Ŭ���� ������ ����, �޼ҵ带 ��� ����
	}

}
