package intaraction;
// 고난도

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
		// 보통 기본값 데이터를 출력하려고 하는 경우 에러 뜸 -> 조건식으로 바꿔서 출력해야함.
		String name = (driver == null) ? "없음" : driver.name;
		System.out.printf("%s, %dkm/h, %s\n", model, speed, name);
	}
	
	void accel(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!\n");
			showcar();
			
			return;
		}
		this.speed += speed;
		
		System.out.println(speed + "만큼 가속!\n");
		showcar();
	}
	
	void ride(Person driver) {
		this.driver = driver;
		
		System.out.println(driver.name + "님 탑승\n");
	}
	
	void _break(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!\n");
			showcar();
			
			return;
		}
		this.speed -= speed;
		
		System.out.println(speed + "만큼 감속!\n");
		showcar();
	}
	
	void rideoff() {
		
		if (speed != 0) {
			System.out.println("하차불가능!\n");
		}
		else {
			System.out.println(driver.name + "님이 하차하였습니다");
		}
	}


}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person("홍길동");
		Car morning = new Car("모닝");
		
		morning.showcar();
		
		morning.accel(30);		
		
		morning.ride(per);
		
		morning.accel(20);
		
		morning._break(10);
		
		morning.rideoff();
		// 속도 0 아니면 하차 불가능
		
		morning._break(10);
		
		morning.rideoff();
	}

}
