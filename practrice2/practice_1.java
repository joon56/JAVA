import java.util.Scanner;

public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int largest = 0, smallest = 0;
		
		System.out.print("ù ��° �� �Է� : ");
		a = sc.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		b = sc.nextInt();
		System.out.print("�� ��° �� �Է� : ");
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
		System.out.println("�ִ� : " + largest);
		System.out.println("�ּڰ� : " + smallest);
		
				
		sc.close();

	}

}
