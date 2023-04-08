package _interface;

import java.util.Arrays;
import java.util.Comparator;


class Student implements Comparable<Student>{
	String name;
	int kor, math, eng, avg;
		
	public Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	

	@Override
	public int compareTo(Student o) {
		avg = (kor + math + eng) / 3;
		return o.avg - avg;
	}

	@Override
	public String toString() {
		avg = (kor + math + eng) / 3;
		return name + "(" + avg + ")";
	}
	
	public String getName() {
		return name;
	}
	
	
}

public class Quiz01 {

	public static void main(String[] args) {
		Student[] stu = new Student[] {
				new Student("rose", 90, 70, 80),
				new Student("paul", 70, 60, 100),
				new Student("bob", 80, 100, 60),
				new Student("gray", 50, 80, 70),
				new Student("jake", 100, 90, 90),
				
		};
		
		System.out.println(Arrays.toString(stu));
		
		Arrays.sort(stu);
		System.out.println(Arrays.toString(stu));
		
		System.out.printf("1µÕ¿î : %s, ²ÃµîÀº : %s", stu[0], stu[4]);
		
		Comparator<Student> asc = (Student o1, Student o2) -> {
			return o1.getName().compareTo(o2.getName());
		};
		
		Arrays.sort(stu, asc);
		System.out.println(stu);
		
	}

}
