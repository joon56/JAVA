package operator;

public class Ex06 {

	public static void main(String[] args) {
		// �������� : true/false ����
		// ���� : &&, ||, !
		
		// && and : ���� �� ��
		// �ٸ� ���� �� �����̶�� ��
		System.out.println(true && true);    // 1 X 1
		System.out.println(true && false);   // 1 X 0
		//System.out.println(false && true);   // 0 X 1
		//System.out.println(false && false);  // 0 X 0
		
		
		// || or : �� �� �ϳ��� ���̸� ��
		// �ٸ� ���� �� �����̶�� ��
		//System.out.println(true || true);    // 1 + 1
		//System.out.println(true || false);   // 1 + 0
		System.out.println(false || true);   // 0 + 1
		System.out.println(false || false);  // 0 + 0
		
		
		// ! not : ���� �������� ������ ������ �ٲٴ� ����
		// ���������̶�� ��
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!true);  // !! ���� ���� �� ���̶� ���ڸ�
		

	}

}
