
interface Bank {
	
	// 상수 (제공 가능한 최대 금액 제시)
	public int MAX_INTEGER = 10000000;
	
	//추상 메서드(인출)
	void withDraw(int price);
	
	// 추상 메서드(입금)
	void deposit(int price);
	
	// default 메서드 - 고객의 휴면계좌 찾아주는 메서드
	default String findDormancyAccount(String cusId) {
		System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
		System.out.println("**금융걀제원에서 제공하는 로직");
		return "00은행 000-000-0000-0";
	}
	
	// 정적 메서드 - 블록체인 인증을 요청하는 메서드
	static void BCAuth(String bankName) {
		System.out.println(bankName + " 에서 블록체인 인증을 요청합니다.");
		System.out.println("전 금융사 블록체인 로직 수행");
	}
}
