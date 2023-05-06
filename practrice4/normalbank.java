

public class normalbank extends bank{
	
	double nor_rate = rate;		//bank값 조작
	
	
	public void showinfo() {
		System.out.printf("normal 이자율 : %.1f\n", nor_rate);
		
	}
}
