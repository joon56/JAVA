import java.util.Scanner;

public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int largest = 0, smallest = 0;
		
		System.out.print("첫 번째 수 입력 : ");
		a = sc.nextInt();
		System.out.print("두 번째 수 입력 : ");
		b = sc.nextInt();
		System.out.print("세 번째 수 입력 : ");
		c = sc.nextInt();
		
		if (a<b) {
			if(b<c) {
				largest = c;
				smallest = a;
			}
			else {
				largest = b;
				if(a<c) 
					smallest = a;
				else
					smallest = c;
			}
		}
		
		if (a>b) {
			if(a<c) {
				largest = c;
				smallest = b;
			}
			else {
				largest = a;
				if(b<c)
					smallest = b;
				else
					smallest = c;
			}
		}
		System.out.println("최댓값 : " + largest);
		System.out.println("최솟값 : " + smallest);
		
				
		sc.close();

	}

}
