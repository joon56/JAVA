package variable;

// �� : 0 1 2 3 4  5  6   7   8   9   10         16
// �� : 1 2 4 8 16 32 64 128 256 512 1024       65536
/*
 boolean  ��/����   1bit
 char     ����       2byte    java�� �ƽ�Ű�ڵ� ��� ���ؼ� 2����Ʈ��
 byte     ����	 1byte
 short	   ����	 2byte
 int      ����	 4byte	  ���� ��ǥŸ��
 long     ����       8byte
 float    �Ǽ�       4byte
 double   �Ǽ�	 8byte	  �Ǽ� ��ǥŸ��
*/
public class Ex02 {

	public static void main(String[] args) {
		
		boolean bo = true;  //�ҹ��� ����
		char ch = 'A'; 		//���� ����ǥ ����
		byte by = 127;
		short sh = 32767;
		int in = 2000000000;
		
		// ���ͷ� : �ӽð�, ������ ������� ���� ������
		// �޸� �ӽ� ���� ���� = ���Ǯ
		// ���Ǯ�� �����͸� ��ǥŸ������ �����ؼ� �ӽ� ����
		
		long lo = 3000000000L; // �ڿ� L ���̸� long ������ ��ȯ ��ҹ��� �������
		float fl = 1.12345678F; // F�� float���� ����
		
		double db = 1.12345678;
		
		System.out.println("bo = " + bo);
		System.out.println("ch = " + ch);
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("in = " + in);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("db = " + db);
		

	}

}
