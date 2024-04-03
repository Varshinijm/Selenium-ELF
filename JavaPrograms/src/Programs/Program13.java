package Programs;

public class Program13 {

	public static void main(String[] args) {
		String str="Ab2his6hek12";
		String[] s = str.split("");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].charAt(0)>='0' && s[i].charAt(0)<='9')
			{
				s[i]="";
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
	}
}
