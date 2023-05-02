import java.util.Scanner;

class Car {
	int carnum;
	String model;
	String firm;
	
	Car(int a, String name, String com) {	// car2에서 3개의 매개변수를 활용하기 때문에 이러한 생성자 만들어준다
		this.carnum = a;
		this.model = name;
		this.firm = com;
	}
	
	Car() {									// car2를 제외한 나머지는 이러한 형태로 받아주기 떄문에 생성자 만들어준다 
		
	}
	
	
	public void inputcarnum() {				// 입력은 각 함수에 스캐너 생성
		Scanner sc1 = new Scanner(System.in);
		System.out.print("차 번호를 입력하시오 : ");
		carnum = sc1.nextInt();
		 
	}
	public void inputmodel() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("모델명을 입력하시오 : ");
		model = sc2.next();
		
	}
	public void inputfirm() {
		Scanner sc3 = new Scanner(System.in);
		System.out.print("차 회사명을 입력하시오 : ");
		firm = sc3.next();
		 
	}
	
	public void getInfo() {		// this가 의미하는 해당 자동차의 정보를 바탕으로 출력을 하는ㄴ 것이기 떄문에 이렇게 출력함
		System.out.printf("Car Firm Name is %s%nCar Model Name is %s%nCar Plate Number is %d%n", this.getFirm(), this.getName(), this.getPlate());
	}
	
	public int getPlate() {
		if (carnum < 1000 || carnum > 9999) {
			System.out.println("올바른 번호가 아닙니다.");
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
	
	void setcarnum(int plate) {		//이는 번호, 모델, 회사를 따로 받아줄 때 활용하기 위해 적어준다.
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
		
		Car car1 = new Car();		// 2번째 생성자, set 3개, get 3개, getinfo 활용
		car1.setName("IONIQ5");
		car1.setFirm("Hyundai");
		car1.setcarnum(1123);
		
		Car car2 = new Car(1234, "EV6", "KIA");	// 첫 번째 생성자, get 3개, getinfo 활용
		
		Car car3 = new Car();		// 첫 번째 생성자, input, get 3개, getinfo 활용
		car3.inputcarnum();	//ex. 5678
		car3.inputmodel();	//ex. SONATA
		car3.inputfirm();	//ex. Hyundai
		
		Car car4 = new Car();		// 첫 번째 생성자, set 3개, get 3개, getinfo 활용
		car4.setName("IONIQ6");
		car4.setFirm("Hyundai");
		
		Car car5 = new Car();		// 첫 번째 생성자, get 3개, getinfo 활용
		
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
