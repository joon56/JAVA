package other;


// �Ϲ� Ŭ���� - ���뼺�� ������
// - �ܺο��� �ҷ��� ���� �� �Ұ���, ���� ��Ű�������� ���
// - ��¥�� �ܺο��� ����� �� ���� ������ ���ϸ�� Ŭ�������� ���� �ʾƵ� ��.
// - �׷��� �� �������� ������ �ۼ� ����
public class Car {
	private String model;
	private int speed;
	
	public Car(String model) {
		
		this.model = model;
	}
	
	public void show() {
		System.out.printf("%s (%dkm/h)\n", model, speed);
	}
	
	public int accel(int a) {
		this.speed += a;
		show();
		
		return this.speed;
		
	}
	
	public int _break(int b) {
		this.speed -= b;
		show();
		
		return this.speed;
	}
	
	
}

