package other;
// inheritance Ex02


public class Herit {
	protected String name;
	protected int age;
	
	public Herit(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// public Herit() {} - �̷��� �޾Ƶ� �Ǳ���.
		
	
	
	public void showInfo() {
		System.out.printf("%s (%d��)\n", name, age);
	}
	
	public void eat(String food) {
		System.out.printf("%s�� %s�� �Դ´�\n", name, food);
	}
	
	public  String getName() {
		return name;
	}
	
	
}
