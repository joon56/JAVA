package _interface;

import other.USB;

public class Ex02 {

	public static void main(String[] args) {
		// �͸� ��ø Ŭ���� 
		// �̸� ���� Ŭ���� - ��ȸ��
		// ���� ����� �����Ǿ����� ���� ..
		// �߻�Ʋ������ �������̽� ��ü�� ��� ���� �����ϰ� ���� �����
		
		
		USB usb = new USB() {
			
			@Override
			public void run() {
				System.out.println("32GB connected");
				
			}
		};
		
		PC pc = new PC();
		pc.connect(usb);
		
		
		
		// ���ٽ��̶�� ����ȭ�� ���� ���� �� �����ϰ� ǥ�� �����ϴ�
		USB usb1= () -> {
			System.out.println("64GB connected");
		};
		
		pc.connect(usb1);
	}

}
