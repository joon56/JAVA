package _final;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	final void eat(String food) {
		System.out.printf("\n%s가 %s를 먹는다\n", name, food);
	}
	
	
}

class Student extends Person {
	String grade;

	Student(String name, String grade) {
		super(name);
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(" + grade + ")";
	}
	
	/*	final로 지정되면 상속은 되지만 오버라이드가 안된다.
	 * @Override 
	 * void eat(String food) { 
	 * System.out.println("밥을 먹지 않습니다."); 
	 * }
	 */
	
}

// class college extends Student - 만약 Student가 final이 되면 상속이 불가능한 클래스라서 오류



public class Ex02 {

	public static void main(String[] args) {
		
		Person per = new Person("홍길동");
		
		System.out.println(per);
		
		per.eat("피자");
		
		Student stu = new Student("김길동", "고등학생");
		
		System.out.println(stu);
		stu.eat("라면");

	}

}
