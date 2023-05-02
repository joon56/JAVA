import java.util.Scanner;

class Car {
	int carnum;
	String model;
	String firm;
	
	Car(int a, String name, String com) {	// car2���� 3���� �Ű������� Ȱ���ϱ� ������ �̷��� ������ ������ش�
		this.carnum = a;
		this.model = name;
		this.firm = com;
	}
	
	Car() {									// car2�� ������ �������� �̷��� ���·� �޾��ֱ� ������ ������ ������ش� 
		
	}
	
	
	public void inputcarnum() {				// �Է��� �� �Լ��� ��ĳ�� ����
		Scanner sc1 = new Scanner(System.in);
		System.out.print("�� ��ȣ�� �Է��Ͻÿ� : ");
		carnum = sc1.nextInt();
		 
	}
	public void inputmodel() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("�𵨸��� �Է��Ͻÿ� : ");
		model = sc2.next();
		
	}
	public void inputfirm() {
		Scanner sc3 = new Scanner(System.in);
		System.out.print("�� ȸ����� �Է��Ͻÿ� : ");
		firm = sc3.next();
		 
	}
	
	public void getInfo() {		// this�� �ǹ��ϴ� �ش� �ڵ����� ������ �������� ����� �ϴ¤� ���̱� ������ �̷��� �����
		System.out.printf("Car Firm Name is %s%nCar Model Name is %s%nCar Plate Number is %d%n", this.getFirm(), this.getName(), this.getPlate());
	}
	
	public int getPlate() {
		if (carnum < 1000 || carnum > 9999) {
			System.out.println("�ùٸ� ��ȣ�� �ƴմϴ�.");
		}
		return carnum;
	}
	public String getName() {
		if (model == null) {
			System.out.println("Car name is NULL");
		}
		return model; 

	}
	public String getFirm() {
		if (firm == null) {
			System.out.println("Firm name is NULL");
		}
		return firm;
	}
	
	void setcarnum(int plate) {		//�̴� ��ȣ, ��, ȸ�縦 ���� �޾��� �� Ȱ���ϱ� ���� �����ش�.
		carnum = plate;
	}
	void setName(String name) {
		model = name;
	}
	void setFirm(String firm_name) {
		firm = firm_name;
	}
	
}



public class practice_2 {

	public static void main(String[] args) {
		
		Car car1 = new Car();		// 2��° ������, set 3��, get 3��, getinfo Ȱ��
		car1.setName("IONIQ5");
		car1.setFirm("Hyundai");
		car1.setcarnum(1123);
		
		Car car2 = new Car(1234, "EV6", "KIA");	// ù ��° ������, get 3��, getinfo Ȱ��
		
		Car car3 = new Car();		// ù ��° ������, input, get 3��, getinfo Ȱ��
		car3.inputcarnum();	//ex. 5678
		car3.inputmodel();	//ex. SONATA
		car3.inputfirm();	//ex. Hyundai
		
		Car car4 = new Car();		// ù ��° ������, set 3��, get 3��, getinfo Ȱ��
		car4.setName("IONIQ6");
		car4.setFirm("Hyundai");
		
		Car car5 = new Car();		// ù ��° ������, get 3��, getinfo Ȱ��
		
		System.out.println();
		System.out.println("<Car 1>");
		car1.getInfo();
		System.out.println("<Car 2>");
		car2.getInfo();
		System.out.println("<Car 3>");
		car3.getInfo();
		System.out.println("<Car 4>");
		car4.getInfo();
		System.out.println("<Car 5>");
		car5.getInfo();
	}

}
