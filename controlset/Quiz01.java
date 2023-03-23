package controlset;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ---------------------------------------------------------

		
		int num1, num2;
		
		System.out.print("두 정수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("같다");
		}
		else if ( num1 > num2) {
			System.out.println("처음이 더 큼");
		}
		else {
			System.out.println("두 번째가 더 큼");
		}
		
		// ---------------------------------------------------------

		
		int n1, n2, n3;
		
		System.out.print("세 정수 입력 : ");
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
		
		System.out.print("USB 수 : ");
		usb = sc.nextInt();
		
		if (usb > 100) {								  // 100 초과가 10 이상보다 범위가 작기 때문에 if문에 먼저 넣어줘야함
			disc = usb * 5000 / 100 * 12;                 // *= 같은 복합 대입연산자는 자바에서는 자동 형 변환을 알아서 해줌
			total = usb * 5000 - disc;
		}
		
		else if (usb > 10) {
			disc = usb * 5000 / 10;
			total = usb * 5000 - disc;
		}
		
		
		System.out.println(total);
		
		// ---------------------------------------------------------
		
		int bus, time = 0;
		
		System.out.print("정거장 수 : ");
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
			System.out.printf("%d 시간 %d 분 입니다", hour, minute);
		}
		else {
			System.out.println(time + "분");
		}
		
		
		
		sc.close();
	}

}
