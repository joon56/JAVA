
public class practice_2 {

	public static void main(String[] args) {
		badbank bb = new badbank();			// bb�� badbank�� �޾��� badbank �ڷ����� ����
		goodbank gb = new goodbank();		// gb�� goodbank�� �޾��� goodbank �ڷ����� ����
		normalbank nb = new normalbank();	// nb�� normalbank�� �޾��� normalbank �ڷ����� ����
		badbank ub = new goodbank();			// ub�� goodbank�� �޾��� badbank �ڷ����� ����
		goodbank downbank = (goodbank)ub;	// downbank�� ub������ goodbank�� ���� ����ȯ�� ��Ų ��
											// ��, goodbank���� ub�� ���� ������ - downbank�� �θ� goodbank�̱� ����
		upbank ub2 = new upbank();			// �̰Ŵ� �ؿ� upbank �ڽ��� �ڷ����� ����ϱ� ����
		
		bb.showinfo();
		gb.showinfo();
		nb.showinfo();
		ub.showinfo();
		downbank.showinfo();
		
		// ����� ó�� ������ ������ ������ ���缭, �ڿ� rate�� �θ��� rate �����̸��� �����ش�.
		System.out.printf("goodbank �ڽ��� rate : %.1f\n", gb.good_rate);
		System.out.printf("goodbank �θ��� rate : %.1f\n", gb.bad_rate);
		System.out.printf("upbank �ڽ��� rate : %.1f\n", ub2.up_rate);
		System.out.printf("upbank �θ��� rate : %.1f\n", ub.bad_rate);
		System.out.printf("downbank �ڽ��� rate : %.1f\n", downbank.good_rate);
		System.out.printf("downbank �θ��� rate : %.1f\n", downbank.bad_rate);
	}

}
