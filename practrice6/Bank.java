
interface Bank {
	
	// ��� (���� ������ �ִ� �ݾ� ����)
	public int MAX_INTEGER = 10000000;
	
	//�߻� �޼���(����)
	void withDraw(int price);
	
	// �߻� �޼���(�Ա�)
	void deposit(int price);
	
	// default �޼��� - ���� �޸���� ã���ִ� �޼���
	default String findDormancyAccount(String cusId) {
		System.out.println("**������������ 00���� ���� �޸���� ã���ֱ� �**");
		System.out.println("**�������������� �����ϴ� ����");
		return "00���� 000-000-0000-0";
	}
	
	// ���� �޼��� - ���ü�� ������ ��û�ϴ� �޼���
	static void BCAuth(String bankName) {
		System.out.println(bankName + " ���� ���ü�� ������ ��û�մϴ�.");
		System.out.println("�� ������ ���ü�� ���� ����");
	}
}
