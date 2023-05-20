import java.util.Scanner;

class calc {
	
	double factorial(double num) {	// ���丮�� �Լ�
	// �� ���� ���������� ��ģ ��� �������� �𸣰����� �� �Լ��� int�� �����ϸ� �ȵȴ�.
	//���丮���� ����� int���̱� �ϳ� ���߿� ���Ϸ����� ����ϴµ� �־ ������ ���µ� �ϴ�.
	      double result = 1; 
	      if (num != 0) {		// ������ 0�� �ƴ� �� �Էµ� �Ű����� ��ŭ ���ϴ� for��

	         for (int i = (int) num; i > 0; i--) {
	            result *= i;
	         }
	         return result;

	      } else {
	         return result; 
	      }

	   }

	double multi(double root, double disp) {	// �¼� �Լ�
		// �� ģ���� ���丮��� ���������� ������ double�� �ٲ��־���.
	      double result = 1; 
	      if (disp != 0) {		// disp�� ���� �ŵ������� ���� �ǹ������� �̸� for������ Ƚ��ó�� Ȱ���Ͽ� �ݺ�
	         for (int j = 0; j < disp; j++) {
	            result *= root;

	         }
	         return result;

	      } else {

	         return 1; 
	      }

	   }
}

class taylor {	// ���Ϸ� ���� Ŭ���� - c = 0�� ����� ��Ŭ�θ� �޼��� Ȱ���Ͽ���.
	
	double sin(int x) {	// sin, cos, e, ��� ����� ���̶� �� ���� ���ڽ��ϴ�...
		calc cal = new calc();
		double result = 0;	// ������� ����
		
		for(int i = 0; i < 100; i++) {	// 100�� ����� ���� : 100�� �ش��ϴ� ���ڴ� �󸶳� ���� �����ִ��� ��, ��Ȯ���� �����Ѵ�. �׷��� �� ���� �ϸ� ��Ȯ������ ������ �޸𸮰� �������� ���� ������ ����.
			result += (cal.multi(-1, i) * cal.multi(x, 2*i + 1)) / cal.factorial(2*i + 1);	// ��Ŭ�θ� �޼��� sinx ������
			
		}
		return result;
	}
	
	double cos(int x) {
		calc cal = new calc();
		double result= 0;
		
		for(int i = 0; i < 100; i++) {
			result += (cal.multi(-1, i) * cal.multi(x, 2*i)) / cal.factorial(2*i);
			
		}
		return result;
	}
	
	double e(int x) {
		double result= 0;
		calc cal = new calc();
		
		for(int i = 0; i < 100; i++) {
			result += cal.multi(x, i) / cal.factorial(i);
			
		}
		return result;
	}
}

public class hard_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		taylor num = new taylor();	// ���Ϸ� Ŭ������ ���� ����
		int x = 0;
		
		System.out.print("���Ϸ� �޼��� ���� ������ �Է��Ͻÿ� : ");	// ���� �Է�
		x = sc.nextInt();
		
		System.out.println();
		System.out.printf("sin(%d)�� ���Ϸ� ���� : %f\n", x, num.sin(x));	// ���Ϸ� Ŭ������ ������ Ŭ���� �� �Լ��� �����Ͽ� ���� ����
		System.out.printf("cos(%d)�� ���Ϸ� ���� : %f\n", x, num.cos(x));
		System.out.printf("e^%d�� ���Ϸ� ���� : %f\n", x, num.e(x));
		
		sc.close();
	}

}
