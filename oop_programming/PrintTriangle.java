package oop_programming;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 13; i++) {		//�� #�� 12���̱� ������ �̿� ���� for������ 12�� �ݺ��Ѵ�.
			for(int j = 12; j > 0; j--) {
				if(i < j) {
					System.out.print(" "); //���� �迭���� ġ�������ֱ� ������ ���ǿ� ���� ������ ���� ����Ѵ�.
				}else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
	}

}
