package controlset;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ---------------------------------------------------------

		
		int num1, num2;
		
		System.out.print("�� ���� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("����");
		}
		else if ( num1 > num2) {
			System.out.println("ó���� �� ŭ");
		}
		else {
			System.out.println("�� ��°�� �� ŭ");
		}
		
		// ---------------------------------------------------------

		
		int n1, n2, n3;
		
		System.out.print("�� ���� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();	
		
		int max = 0, min = 0;
		
		if (n1 > n2) {
			max = n1;
			if (n3 > n1) {
				max = n3;
			}
		}
		if (n2 > n1)  {
			max = n2;
			if (n3 > n2) {
				max = n3;
			}
		}
		if (n1 < n2) {
			min = n1;
			if (n3 < n1) {
				min = n3;
			}
		}
		if (n2 < n1)  {
			min = n2;
			if (n3 < n2) {
				min = n3;
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		// ---------------------------------------------------------

		
		int usb, total = 0, disc = 0;
		
		System.out.print("USB �� : ");
		usb = sc.nextInt();
		
		if (usb > 100) {								  // 100 �ʰ��� 10 �̻󺸴� ������ �۱� ������ if���� ���� �־������
			disc = usb * 5000 / 100 * 12;                 // *= ���� ���� ���Կ����ڴ� �ڹٿ����� �ڵ� �� ��ȯ�� �˾Ƽ� ����
			total = usb * 5000 - disc;
		}
		
		else if (usb > 10) {
			disc = usb * 5000 / 10;
			total = usb * 5000 - disc;
		}
		
		
		System.out.println(total);
		
		// ---------------------------------------------------------
		
		int bus, time = 0;
		
		System.out.print("������ �� : ");
		bus = sc.nextInt();
		
		if (bus < 10) {
			time = bus * 2;
		}
		else if (bus > 10) {
			time = bus * 4;
		}
		
		int hour = 0, minute = 0;
		
		if (time >= 60) {
			hour = time / 60;
			minute = time % 60;
			System.out.printf("%d �ð� %d �� �Դϴ�", hour, minute);
		}
		else {
			System.out.println(time + "��");
		}
		
		
		
		sc.close();
	}

}
