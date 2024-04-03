package Programs;

public class Program24P1 {

	public static void smallest(int[] a) {
		int small = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= small) {
				small = a[i];
			}
		}
		System.out.println(small);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 0, 45, 89, 1, 90, -1, 66, -2,-22 };
		smallest(a);
	}
}
