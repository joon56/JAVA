package wrapper;

public class Ex02 {

	public static void main(String[] args) {
		// wrapper Ŭ������ Ŭ������ �Ϲ� Ÿ�԰� ����ȯ�� �Ͼ�� �ʴ´�
		
		String str1 = "10";
		String str2 = "10";
		
		System.out.println(str1 + str2);
		
		int n1 = Integer.parseInt(str1);
		// ���ڿ����� ���ڸ� ã�� parseInt�� ���� int�� ó��
		// ��, ���ڰ� �ƴ� ���� ��� ����
		
		System.out.println(n1 + 2);
		
		
		
		
		// ���� -> ���ڿ�
		str1 = Integer.toString(3541);
		// ������ ���ڿ��� �ٲٴ°��� ������ ""ġ�� �ȵ�
		
		System.out.println(str1);
		
		// �� �� ���� ���� -> ���ڿ� ����ȯ
		String str = 10 + 13 + "";
		String str0 = "" + 10 + 13;
		
		System.out.println(str);
		System.out.println(str0);
		
		
		
		// ���ڿ� -> �Ǽ�
		double d1 = Double.parseDouble("3.141592");
		System.out.println(d1);
		
	}

}
