package Programs;

public class Program8 {

	public static void main(String[] args) {
		String str = "Hello I am a good boy";
		String[] s = str.split(" ");
		for (int i = s.length - 1; i > -1; i--) {
			System.out.print(s[i]+" ");
		}
	}
}
