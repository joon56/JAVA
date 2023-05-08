class KBBank implements Bank {

	@Override
	public void withDraw(int price) {
		System.out.print("KB은행만의 인출 로직...");
		if(price < Bank.MAX_INTEGER) {
			System.out.println(price + " 원을 인출한다.");
		}
		else {
			System.out.println(price + " 원을 인출실패.");
		}
	}

	@Override
	public void deposit(int price) {
		System.out.println("KB은행만의 입금 로직..."+price+" 원을 입금한다.");
		
	}
	
}

class SHBank implements Bank {

	@Override
	public void withDraw(int price) {
		System.out.print("SH은행만의 인출 로직...");
		if(price < Bank.MAX_INTEGER) {
			System.out.println(price + " 원을 인출한다.");
		}
		else {
			System.out.println(price + " 원을 인출실패.");
		}
		
	}

	@Override
	public void deposit(int price) {
		System.out.println("SH은행만의 입금 로직..."+price+" 원을 입금한다.");
		
	}
	
	public String findDormancyAccount(String cusId) {
		System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
		System.out.println("**SH은행만의 로직 적용");
		return "00은행 000-000-0000-0";
	}
	
}

class KakaoBank {

	
	public void withDraw(int price) {
		System.out.print("Kakao은행만의 인출 로직...");
		System.out.println(price + " 원을 인출한다.");
		
	}

	
	public void deposit(int price) {
		System.out.println("Kakao은행만의 입금 로직..."+price+" 원을 입금한다.");
		
	}
	
	public String findDormancyAccount(String cusId) {
		System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
		System.out.println("**Kakao은행만의 로직 적용");
		return "00은행 000-000-0000-0";
	}
	
}


public class practice_3 {

	public static void main(String[] args) {
		Bank bank = new KBBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("786231");
		Bank.BCAuth("KBBank");
		
		System.out.println("\n*****인스턴스 교체!*****\n");
		
		bank = new SHBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		Bank.BCAuth("ShBank");
		
		System.out.println("\n*****카카오 은행 연동 실패!*****\n");
		// 인터페이스를 사속받지 않았기 때문에 호환하지 않는다
		/*
		bank = new SHBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		*/
		
		System.out.println("\n*****주은행 교체!*****\n");
		
		bank = new KBBank(); // new KBBank();
		bank.withDraw(20000);
		bank.deposit(1000);
		bank.findDormancyAccount("855512");
		Bank.BCAuth("SHBank");
	}

}
