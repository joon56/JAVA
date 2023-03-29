package accessmodifier;

// access method
// - private 멤버에 접근하게하는 메서드
// - getter, setter하고도 한다

class People {
	private String name;
	private int age;
	
	
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public void showinfo() {
		System.out.printf("%s %d세\n\n", name, age);
	}
	
	String getName() {		// access메소드
		return name;
	}
	 // getName으로 return 받으면 private 접근 가능
	// 그러나 p1.getName() = "홍진호" 이런건  안됨 -> getter set은 그냥 보기만하는 용도이기 때문이다.
	// getter로 뭔가를 바꾸는건 불가능 오직 일기 전용

	
	void setName(String name) {
		this.name = name;
	}
	// setter는 전달받은 값으로 필드를 변경
	// getter와는 다르게 오직 변경만 가능함 -> 읽기 불가능
	
	
	// access메소드들은 무조건 작성할 필요는 없음
	// 필요한 경우에만 만들면 된다.
	
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		People p1 = new People("홍길동", 26);
		
		p1.showinfo();
		
		// p1.name = "홍진호";
		// 위줄 오류남 - private라서 사용 불가능
		
		System.out.println( p1.getName()); 
		
		p1.setAge(24);
		System.out.println(p1.getAge());
		
		p1.showinfo();
	}

}
