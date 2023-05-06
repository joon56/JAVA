
public class badbank extends bank{
	
		
	double bad_rate = rate * 0.5;	// bank의 이자율을 조작
		
	public void showinfo() {
	System.out.printf("bad 이자율 : %.1f\n", bad_rate);
	}
	
}
