package object;

// 자바의 최상위 클래스 > object
// - 어떠한 클래스던지 object를 상속 받음

// 따라서 어떠한 클래스던지 다 업 캐스팅이 가능함.

// 그냥 임의로 class Person을 만들면 extends Object가 생략되서 나옴

class Student extends Object {	// 상속을 받지 않는 class는 자동으로 이게 내재됨
	private String name;
	private int age;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
		public String toString() {
		
			String result = String.format("%s (%d세)", name, age);
			// .format을 쓰면 문자열로 저장 가능!!
			
			return result;
			// 무조건 return에서 받아지게 해야함
		}

	// source에서 hashcode() equals 자동완성----------절대 이해 X
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		if (this == obj)	// 같은 대상을 참조하는지
			return true;
		
		if (obj == null)	// 비교 대상이 있는지 없는지
			return false;
		
		if (getClass() != obj.getClass())	// 두 클래스가 같은지
			return false;
		
		Student other = (Student) obj;	// 멤버 비교를 위해 down casting
		
		if (age != other.age)	// 나이가 다른지
			return false;
		
		if (name == null) {		// 이름이 null인지
			if (other.name != null)		// 대상의 이름이 null이 아닌지
				return false;
		}
		else if (!name.equals(other.name))	// 이름이 다른지
			return false;
		
		return true;
		*/
		
		// 위에꺼 해도 되고 이렇게 해도 됨
		// 값 비교하는 코드
		Student tar = (Student) obj;
		
		if (name.equals(tar.name) && age == tar.age) {
			return true;
		}
		return false;
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Student p1 = new Student("홍길동", 17);
		Student p2 = new Student("홍길동", 17);
		Student p3 = p1;
		
		System.out.println(p1);
		System.out.println(p1.toString());
		// 그냥 object에 있는 to string을 이용하면 해쉬코드 뜸
		// override를 하면 참조 변수를 원하는형태로 출력 가능
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		// .equals는 값이 같은 것을 보는게 아니라 참조하는게 같은지를 보는 것!!

	}

}
