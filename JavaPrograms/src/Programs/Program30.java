package Programs;

public class Program30 {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 3, 5, 6, 7, 8 };

		int totalLen = arr1.length + arr2.length;
		int a[] = new int[totalLen];
		for (int n = 0; n < a.length; n++) {
			for (int i = 0; i < arr1.length; i++) {
				a[i] = arr1[i];
			}
			for (int i = totalLen - arr1.length - 1,k=0; i < totalLen; i++,k++) {
				a[i] = arr2[k];
			}
		}
		for(int i=0;i<totalLen;i++)
		{
			System.out.print(a[i]+",");
		}
	}
}
