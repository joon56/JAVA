package input;

import java.io.IOException;

// ���� �Է��� class ������� ����� ������ ���� ����

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// System.in : �Է� ��ü
		
		int n;
		
		System.out.println("���� �ϳ� : "); 
		n = System.in.read();
		// ���� ��� �ϳ� �� ������ ������ �ܼ�â �����ϰ� �Է��ؾ���
		
		System.out.println(n);
		
		// System.in 
		// 1. ����ó�� �ʿ���
		// 2. Ű�����ϳ� �ۿ� �� ����
	}

}
