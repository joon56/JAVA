import java.util.Scanner;

public class hard_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double price;	// ���� - �����Բ��� ���� 197.55�� ���ص� �ȴٰ� �ϼż� �Է¹ް� �Ͽ����ϴ�.
		
		System.out.print("������ �Է��Ͻÿ�(�Ҽ� 2���� �ڸ�����) : ");
		price = sc.nextDouble();
		
		double taxrate = 0.06;	// ����
		double tax = price * taxrate;	// �ΰ��� ����
		
		System.out.printf("�ΰ����� : %d�޷��̴�\n", (int)tax);	// ���� ����ȯ int������ (���� tax�� 0.06 ���ϴϱ� �Ǽ�����)
		System.out.printf("������ ����� ������? : %d�޷��̴�", (int)(price - tax));	// ���� ���������� ����ȯ
		
		sc.close();
	}

}
