package object;

import java.util.Scanner;

class Account {
	String id;
	String pw;
	
	Account(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	// hashcode()�ε� ����
	void login(Account a) {
		if(id.equals(a.id) && pw.equals(a.pw)) {
			System.out.println("�α����� ȯ���մϴ�!");
		}
		else {
			System.out.println("�������� �ʴ� �����Դϴ�");
		}
	}
	
	
}

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account storeacc = new Account("itbank", "qwe@123");
		
		String id, pw;
		
		System.out.print("���̵� �Է��Ͻÿ� : ");
		id = sc.next();
		
		
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		pw = sc.next();
		
		Account user = new Account(id, pw);
		
		storeacc.login(user);
		
		sc.close();

	}

}
