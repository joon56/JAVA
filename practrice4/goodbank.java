

public class goodbank extends badbank{
	
	double good_rate = rate * 1.5;	// bank�� ����
	
	public void showinfo() {
		System.out.printf("good ������ : %.1f\n", good_rate);
		
	}
}
