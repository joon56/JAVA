import java.util.Scanner;

public class practice_1 {
	
	static double getweight() {		// �����Դ� �Է��� �������·� ������ ��ȯ�� �Ǽ������� �޾ƾ��ϱ� ������ �ڵ� �� ��ȯ�� ���� double�� �����Ѵ�
		Scanner sc1 = new Scanner(System.in);	// ��ĳ�ʸ� ���� ���� �� �Լ� ���� ���� ��ĳ�ʸ� ����Ѵ�.
		System.out.print("�����Ը� �Է��Ͻÿ� : ");
		double weight = sc1.nextDouble();
		
		return weight;
	}
	
	static double getheight() {		// ������ �Լ��� ����
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		double height = sc2.nextDouble();
		
		return height;
	}
	
	static double bmi(double height, double weight) {	//�� �Լ��� bmi ��±��� ��ƹ����� return�� �ޱ� �� ����� �ϱ� ������ ���� ������ �Ǳ� ����.
		return (weight / (height*height))*10000;
	}
	
	static void printbmi() {							// �׷��� print�ϴ� �Լ��� ���� �����Ѵ�.
		System.out.println(bmi(getheight(), getweight()));
	}
	
	public static void main(String[] args) {
		
		printbmi();
		
		
	}

}
