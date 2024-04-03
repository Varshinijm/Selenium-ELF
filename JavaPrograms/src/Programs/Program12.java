package Programs;

public class Program12 {

	public static void main(String[] args) {
		String str="My Name is Arun";
		String[] s = str.split("");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].charAt(0)>='a' && s[i].charAt(0)<='z')
			{
				s[i]=s[i].toUpperCase();
			}
			else if(s[i].charAt(0)>='A' && s[i].charAt(0)<='Z' )
			{
				s[i]=s[i].toLowerCase();
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
	}
}
