import java.util.Scanner;

public class practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      
	      System.out.print("������ �Է��ϼ���: ");
	      
	      int year = sc.nextInt();
	      
	      switch(year%12) {
	      case 0:
	         System.out.print(year + "���� �ش� �������� �� �Դϴ�.");
	         break;
	      case 1:
	         System.out.print(year + "���� �ش� ���� �� �Դϴ�.");
	         break;
	      case 2:
	         System.out.print(year + "���� �ش� ���� �� �Դϴ�.");
	         break;
	      case 3:
	         System.out.print(year + "���� �ش� ������ �� �Դϴ�.");
	         break;
	      case 4:
	         System.out.print(year + "���� �ش� ���� �� �Դϴ�.");
	         break;
	      case 5:
	         System.out.print(year + "���� �ش� ���� �� �Դϴ�.");
	         break;
	      case 6:
	         System.out.print(year + "���� �ش� ȣ������ �� �Դϴ�.");
	         break;
	      case 7:
	         System.out.print(year + "���� �ش� �䳢�� �� �Դϴ�.");
	         break;
	      case 8:
	         System.out.print(year + "���� �ش� ���� �� �Դϴ�.");
	         break;
	      case 9:
	         System.out.print(year + "���� �ش� ���� �� �Դϴ�.");
	         break;
	      case 10:
	         System.out.print(year + "���� �ش� ���� �� �Դϴ�.");
	         break;
	      case 11:
	         System.out.print(year + "���� �ش� ���� �� �Դϴ�.");
	         break;
	      }

	      sc.close();
	}

}
