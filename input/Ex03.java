package input;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Scan ���� ctrl + space �ϸ� import���� �ڵ��ϼ�
		
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		// String�̳� char �� ����
		
		System.out.print("boolean : ");
		bo = scan.nextBoolean();
		
		System.out.println(bo);
		
		System.out.print("byte : ");
		by = scan.nextByte();
		
		System.out.println(by);
		
		System.out.print("short : ");
		sh = scan.nextShort();
		
		System.out.println(sh);
		
		System.out.print("int : ");
		it = scan.nextInt();
		
		System.out.println(it);
		
		System.out.print("long : ");
		lo = scan.nextLong();
		
		System.out.println(lo);
		
		System.out.print("flaot : ");
		fl = scan.nextFloat();
		
		System.out.println(fl);
		
		System.out.print("double : ");
		db = scan.nextDouble();
		
		System.out.println(db);

		scan.close();
	}

}
