

public class upbank extends goodbank{
	
	double up_rate = rate * 2;		// bank값 조작
	
	public void showinfo() {
		System.out.printf("up 이자율 : %.1f\n", up_rate);
	
	}
}
