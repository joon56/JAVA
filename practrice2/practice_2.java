import java.util.Scanner;

public class practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      
	      System.out.print("연도를 입력하세요: ");
	      
	      int year = sc.nextInt();
	      
	      switch(year%12) {
	      case 0:
	         System.out.print(year + "년의 해는 원숭이의 해 입니다.");
	         break;
	      case 1:
	         System.out.print(year + "년의 해는 닭의 해 입니다.");
	         break;
	      case 2:
	         System.out.print(year + "년의 해는 개의 해 입니다.");
	         break;
	      case 3:
	         System.out.print(year + "년의 해는 돼지의 해 입니다.");
	         break;
	      case 4:
	         System.out.print(year + "년의 해는 쥐의 해 입니다.");
	         break;
	      case 5:
	         System.out.print(year + "년의 해는 소의 해 입니다.");
	         break;
	      case 6:
	         System.out.print(year + "년의 해는 호랑이의 해 입니다.");
	         break;
	      case 7:
	         System.out.print(year + "년의 해는 토끼의 해 입니다.");
	         break;
	      case 8:
	         System.out.print(year + "년의 해는 용의 해 입니다.");
	         break;
	      case 9:
	         System.out.print(year + "년의 해는 뱀의 해 입니다.");
	         break;
	      case 10:
	         System.out.print(year + "년의 해는 말의 해 입니다.");
	         break;
	      case 11:
	         System.out.print(year + "년의 해는 양의 해 입니다.");
	         break;
	      }

	      sc.close();
	}

}
