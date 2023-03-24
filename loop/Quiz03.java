package loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int total = 0;
		 for (int i = 1; i <= 1000; i++) {
			 if (i % 3 == 0 ) {
				 continue;
			 }
			 if (i % 2 == 0 || i % 5 == 0) {
				 total = total + i;
			 }
			 
		 }
		 System.out.println(total);
		 
		 
		 int a, fac = 1;
		 System.out.print("정수 입력 : ");
		 a = sc.nextInt();
		 for (int i = 1; i <= a; i++) {
			 fac *= i;
		 }
		 System.out.println(fac);
		 
		 
		 int mon = 1;
		 int sum = 0;
		 for(int day = 1; day <= 30; day++) {
			 sum += mon;
			 mon *= 2;
			 System.out.println(day + "일차 : " + sum);
		 }
		 
		 
		 sc.close();
	}

}
