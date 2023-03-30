package intaraction;
// ����

class Person{
	String name;

	Person(String name) {		
		this.name = name;
	}
	
	
}

class Car {
	String model;
	int speed;
	Person driver;
	

	Car(String model) {	
		this.model = model;
	}
	
	void showcar() {
		// ���� �⺻�� �����͸� ����Ϸ��� �ϴ� ��� ���� �� -> ���ǽ����� �ٲ㼭 ����ؾ���.
		String name = (driver == null) ? "����" : driver.name;
		System.out.printf("%s, %dkm/h, %s\n", model, speed, name);
	}
	
	void accel(int speed) {
		if (driver == null) {
			System.out.println("�����ڰ� �����ϴ�!\n");
			showcar();
			
			return;
		}
		this.speed += speed;
		
		System.out.println(speed + "��ŭ ����!\n");
		showcar();
	}
	
	void ride(Person driver) {
		this.driver = driver;
		
		System.out.println(driver.name + "�� ž��\n");
	}
	
	void _break(int speed) {
		if (driver == null) {
			System.out.println("�����ڰ� �����ϴ�!\n");
			showcar();
			
			return;
		}
		this.speed -= speed;
		
		System.out.println(speed + "��ŭ ����!\n");
		showcar();
	}
	
	void rideoff() {
		
		if (speed != 0) {
			System.out.println("�����Ұ���!\n");
		}
		else {
			System.out.println(driver.name + "���� �����Ͽ����ϴ�");
		}
	}


}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person("ȫ�浿");
		Car morning = new Car("���");
		
		morning.showcar();
		
		morning.accel(30);		
		
		morning.ride(per);
		
		morning.accel(20);
		
		morning._break(10);
		
		morning.rideoff();
		// �ӵ� 0 �ƴϸ� ���� �Ұ���
		
		morning._break(10);
		
		morning.rideoff();
	}

}
