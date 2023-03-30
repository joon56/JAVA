package wrapper;

class point <T>{
	T x, y;

	point(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		
		return "(" + x + "," + y + ")";
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		point<Integer> p2 = new point<Integer>(5, 2);
		point<Double> p3 = new point<Double>(2.4, 5.72);
		point<Boolean> p4 = new point<Boolean>(true, false);
		
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3);
		System.out.println("p4 = " + p4);
	}

}
