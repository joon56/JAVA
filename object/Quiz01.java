package object;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String logid;
		System.out.print("���̵� �Է��Ͻÿ� : ");
		logid = sc.next();
		
		String logpw;
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		logpw = sc.next();
		
		
		String storeID = "itbank";
		String storePW = "qwe@123";
		
		if(logid.equals(storeID) && logpw.equals(storePW)) {
			System.out.println("�α����� ȯ���մϴ�!");
		}
		else {
			System.out.println("�������� �ʴ� �����Դϴ�");
		}
		
		sc.close();

	}

}
