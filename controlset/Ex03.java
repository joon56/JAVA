package controlset;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// ÁßÃ¸ Á¶°Ç¹®
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Á¤¼ö ÀÔ·Â : ");
		num = sc.nextInt();
		
		if (num %2 == 0 ) {
			System.out.println("Â¦¼ö");
			
			if (num % 3 == 0) {
				System.out.println("Â¦¼ö + 3ÀÇ ¹è¼ö");
			}
		}
		
		
		
		else {
			System.out.println("È¦¼ö");
			if ( num % 3 == 0) {
				System.out.println("È¦¼ö + 3ÀÇ ¹è¼ö");
			}
			else if (num % 5 == 0) {
				System.out.println("È¦¼ö + 5ÀÇ ¹è¼ö");
			}
		}
		
		sc.close();
	}

}
