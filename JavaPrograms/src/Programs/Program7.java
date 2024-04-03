package Programs;

public class Program7 {

	public static void main(String[] args) {
		String str="Hello My name is Ram";
		String[] s = str.split("");
		for(int i=s.length-1;i>-1;i--)
		{
			System.out.print(s[i]);
		}
	}
}
