package other;
// inheritance Ex02


public class Herit {
	protected String name;
	protected int age;
	
	public Herit(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// public Herit() {} - 이렇게 받아도 되긴함.
		
	
	
	public void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}
	
	public void eat(String food) {
		System.out.printf("%s가 %s를 먹는다\n", name, food);
	}
	
	public  String getName() {
		return name;
	}
	
	
}
