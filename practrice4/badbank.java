
public class badbank extends bank{
	
		
	double bad_rate = rate * 0.5;	// bank�� �������� ����
		
	public void showinfo() {
	System.out.printf("bad ������ : %.1f\n", bad_rate);
	}
	
}
