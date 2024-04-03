package Programs;

public class Program31 {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 3, 5, 6, 7, 8 };

		int totalLen = arr1.length + arr2.length;
		int a[] = new int[totalLen];

		// System.out.println(totalLen);

		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0 && evenCount < arr1.length) {
				a[i] = arr1[evenCount];
				evenCount++;
			} else if (oddCount < arr2.length) {
				a[i] = arr2[oddCount];
				oddCount++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
