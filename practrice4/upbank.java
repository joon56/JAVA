

public class upbank extends goodbank{
	
	double up_rate = rate * 2;		// bank�� ����
	
	public void showinfo() {
		System.out.printf("up ������ : %.1f\n", up_rate);
	
	}
}
