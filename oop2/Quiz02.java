package oop2;

class Car {
	String model;
	int speed;
	
	Car (String model) {
		this.model = model;					// this는 생략 가능하긴 함
		
	}
	
	void showcar() {
		
		
		System.out.printf("%s (%dkm/h)\n", this.model, this.speed);
		
	}
	
	int accel(int km) {
		this.speed += km;
		System.out.printf("%d km/h 가속\n", this.speed);
		
		return this.speed;
	}
	
	int _break(int min ) {
		this.speed -= min;
		System.out.printf("%d km/h 감속\n", this.speed);
		
		return this.speed;
	}
}

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car morning = new Car("모닝");
		
		morning.showcar();
		
		morning.accel(30);
		morning.showcar();
		
		
		
		morning._break(10);
		morning.showcar();

	}

}
