import java.util.Scanner;

public class practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*100);
		int input, count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0���� 100���� ���ڸ� ���纸����");
		
		do {
			count++;
			System.out.print("������ ���ڸ� �Է��Ͻÿ� : ");
			input = sc.nextInt();
			if(input < num)
				System.out.println("UP!");
			else if(input > num)
				System.out.println("DOWN!");
			else
				break;
		}while(input != num);
		System.out.println("�����Դϴ�");
		System.out.println(count + "�� ���� ���߼̽��ϴ�");
		
		sc.close();

	}

}
