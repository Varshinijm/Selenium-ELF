package Programs;

public class Program7P1 {

	public static void main(String[] args) {
		String str="Hello I am a good boy";
		String[] s = str.split(" ");
		String string="";
		for(int i=0;i<s.length;i++)
		{
			
				for(int k=s[i].length()-1;k>=0;k--)
				{
					string+=s[i].charAt(k);
				}
				string+=" ";
			
		}
		System.out.println(string);
	}
}
