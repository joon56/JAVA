package exeption;

// ���� ���
// 1. ���� : system ������ ���� - ó���ϴ°� �Ұ���
// 2. ���� : ������ �ڵ� ���� ���� - ó���� ����

// ���ܸ� �����ؼ� ó���ϴ� ���� ����ó����� �Ѵ�

public class Ex01 {

	public static void main(String[] args) {
		
		try {	// ���ܸ� �˻��ϴ� ����
			System.out.println(10 / 0);
			
			System.out.println("��������!");	// try���� ���ܰ� �߻��� ���� ���ķδ� ���� �ȵ�
		}catch(ArithmeticException e) {		// ��ȣ �ȿ� ���� ������ ���� + ����
			System.err.println("���ܹ߻�");	// err�� �ϸ� �ٸ������ ��µ�
			
			System.err.println(e.getMessage());	// 1. ���� �޼����� ���!! �߿�
			
			e.printStackTrace();	// 2. � �޼��忡�� ������ �߻��ߴ��� ��ü������ �˷���
		}
		
	}

}
