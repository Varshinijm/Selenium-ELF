package Programs;

public class Program38 {

	public static void main(String[] args) {
		String str = "sum";
		int len = str.length();
		for (int i = 0; i <=len; i++) {
			for (int j = i+1; j <=len; j++) {
				System.out.println(str.substring(i, j));

			}

		}
	}
}
