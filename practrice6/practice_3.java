class KBBank implements Bank {

	@Override
	public void withDraw(int price) {
		System.out.print("KB���ุ�� ���� ����...");
		if(price < Bank.MAX_INTEGER) {
			System.out.println(price + " ���� �����Ѵ�.");
		}
		else {
			System.out.println(price + " ���� �������.");
		}
	}

	@Override
	public void deposit(int price) {
		System.out.println("KB���ุ�� �Ա� ����..."+price+" ���� �Ա��Ѵ�.");
		
	}
	
}

class SHBank implements Bank {

	@Override
	public void withDraw(int price) {
		System.out.print("SH���ุ�� ���� ����...");
		if(price < Bank.MAX_INTEGER) {
			System.out.println(price + " ���� �����Ѵ�.");
		}
		else {
			System.out.println(price + " ���� �������.");
		}
		
	}

	@Override
	public void deposit(int price) {
		System.out.println("SH���ุ�� �Ա� ����..."+price+" ���� �Ա��Ѵ�.");
		
	}
	
	public String findDormancyAccount(String cusId) {
		System.out.println("**������������ 00���� ���� �޸���� ã���ֱ� �**");
		System.out.println("**SH���ุ�� ���� ����");
		return "00���� 000-000-0000-0";
	}
	
}

class KakaoBank {

	
	public void withDraw(int price) {
		System.out.print("Kakao���ุ�� ���� ����...");
		System.out.println(price + " ���� �����Ѵ�.");
		
	}

	
	public void deposit(int price) {
		System.out.println("Kakao���ุ�� �Ա� ����..."+price+" ���� �Ա��Ѵ�.");
		
	}
	
	public String findDormancyAccount(String cusId) {
		System.out.println("**������������ 00���� ���� �޸���� ã���ֱ� �**");
		System.out.println("**Kakao���ุ�� ���� ����");
		return "00���� 000-000-0000-0";
	}
	
}


public class practice_3 {

	public static void main(String[] args) {
		Bank bank = new KBBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("786231");
		Bank.BCAuth("KBBank");
		
		System.out.println("\n*****�ν��Ͻ� ��ü!*****\n");
		
		bank = new SHBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		Bank.BCAuth("ShBank");
		
		System.out.println("\n*****īī�� ���� ���� ����!*****\n");
		// �������̽��� ��ӹ��� �ʾұ� ������ ȣȯ���� �ʴ´�
		/*
		bank = new SHBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		*/
		
		System.out.println("\n*****������ ��ü!*****\n");
		
		bank = new KBBank(); // new KBBank();
		bank.withDraw(20000);
		bank.deposit(1000);
		bank.findDormancyAccount("855512");
		Bank.BCAuth("SHBank");
	}

}
