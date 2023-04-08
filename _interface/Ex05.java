package _interface;

import java.util.Arrays;
import java.util.Comparator;

// Comparable
// 클래스에 상속 받아서 사용하는 인터페이스
// 해당 클래스의 기본 비교 기준이 된다

// Comparator
// 안에 있는 compare()라는 메서드를 사용
// 주로 다른 비교 기준을 사용하고 싶을 때 사용

class Person implements Comparable<Person> {
	 private String name;
	 private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return getName() + "(" + age + ")";
	}

	@Override
	public int compareTo(Person o) {
		// this가 o1 역할, o가 o2 역할
		
		return o.age - age;
	}
	
	public String getName() {
		return name;
	}
	
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Person[] pers = new Person[] {
				new Person("홍길동", 23),
				new Person("김길동", 40),
				new Person("이길동", 17)
		};
		
		System.out.println("정렬 전 : " + Arrays.toString(pers));
		
		// sort에 Comperator를 전달하지 않음
		// -> Comperable을 사용해서 비교
		Arrays.sort(pers);
		System.out.println("정렬 후 : " + Arrays.toString(pers));
		
		
		Comparator<Person> nameasc = (Person o1, Person o2) -> {
			return o1.getName().compareTo(o2.getName());
		};
		
		// Comperator를 전달하면 
		// Comperable 대신 전달한 객체로 비교
		Arrays.sort(pers, nameasc);
		System.out.println("정렬 후 : " + Arrays.toString(pers));
		
		
	}

}
