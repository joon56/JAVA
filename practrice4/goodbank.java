

public class goodbank extends badbank{
	
	double good_rate = rate * 1.5;	// bank값 조작
	
	public void showinfo() {
		System.out.printf("good 이자율 : %.1f\n", good_rate);
		
	}
}
