package other;

public class Func {
	private Func() {}	// private 치면 Math처럼 참조만 가능
	
	public static void printnumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d ", i);
		}
	}
	
	public static int total(int p) {
		int tot = 0;
		for (int i = 0; i <= p; i++) {
			tot += i;
		}
		return tot;
	}
	public static void printarr(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
	
}


