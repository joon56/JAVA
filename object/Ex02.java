package object;

public class Ex02 {

	public static void main(String[] args) {
		// String�� �ϳ��� Ŭ�����̴�
		// java.lang�� ����
		
		String st1 = "java";
		String st2 = "java";
		String st3 = new String("java");
		
		System.out.println("1." + (st1 == st2));
		System.out.println("2." + (st2 == st3));
		System.out.println("3." + st1.equals(st2));

	}

}
