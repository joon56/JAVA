package array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] grade = new int[5];
		
		for(int i = 0; i < grade.length; i++) {
			System.out.print("점수 입력 5개 : ");
			grade[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(grade));
		
		int total = 0;
		double avg = 0.0;
		
		for (int i = 0; i < grade.length; i++) {
			total += grade[i];
		}
		avg = total / 5.0;
		System.out.printf("합계는 : %d, 평균은 : %.1f", total, avg);
		
		
		
		
		
	System.out.println("");
		
				
		int temp;
		for (int i = 0; i < grade.length - 1; i++) {
			for (int j = i + 1; j < grade.length; j++) {
				if (grade[i] > grade[j]) {
					temp = grade[i];
					grade[i] = grade[j];
					grade[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(grade));
		
		
		
		
		sc.close();
	}

}
