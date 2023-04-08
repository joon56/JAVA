package _interface;

import other.USB;

class PC {
	void connect(USB tar) {
		tar.run();
	}
}

class phone implements USB {

	@Override
	public void run() {
		System.out.println("�޴��� ����, ������");
		
	}
	
}

class keyboard implements USB {

	@Override
	public void run() {
		System.out.println("Ű���� ������");
		
	}
	
}

class memory implements USB {

	@Override
	public void run() {
		System.out.println("USB �޸� ������");
		
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		PC pc = new PC();
		
		phone ph = new phone();
		memory mem = new memory();
		keyboard key = new keyboard();
		
		pc.connect(ph);
		pc.connect(mem);
		pc.connect(key);

	}

}
