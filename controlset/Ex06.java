package controlset;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// JavaÀÇ switch case¹®Àº ¹®ÀÚ¿­ Ã³¸® °¡´É
		Scanner sc = new Scanner(System.in);
		String menu;
		
		System.out.println("\t1. Â¥Àå¸é");
		System.out.println("\t2. Â«»Í");
		System.out.println("\t3. ÅÁ¼öÀ°");
		
		System.out.print("¸Ş´º´Â : ");
		menu = sc.next();
		
		switch (menu) {
		case "Â¥Àå¸é": 
			System.out.println("Â¥Àå¸é");
			break;
		case "Â«»Í":
			System.out.println("Â«»Í");
			break;
		case "ÅÁ¼öÀ°":
			System.out.println("ÅÁ¼öÀ°");
			break;
		default :
			System.out.println("±×·± ¸Ş´º ¾ø½À´Ï´Ù");
		}
		
		sc.close();
	}

}
