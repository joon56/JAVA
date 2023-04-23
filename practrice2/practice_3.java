import java.util.Scanner;

public class practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*100);
		int input, count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0부터 100까지 숫자를 맞춰보세요");
		
		do {
			count++;
			System.out.print("추측한 숫자를 입력하시오 : ");
			input = sc.nextInt();
			if(input < num)
				System.out.println("UP!");
			else if(input > num)
				System.out.println("DOWN!");
			else
				break;
		}while(input != num);
		System.out.println("정답입니다");
		System.out.println(count + "번 만에 맞추셨습니다");
		
		sc.close();

	}

}
