package Programs;

public class Program22 {

	public static String Reverse(String str)
	{
		String string="";
		for(int i=str.length()-1;i>=0;i--)
		{
			string=string+str.charAt(i);
			
		}
		return string;
	}
	public static void main(String[] args) {
		String str="Manoj";
		String s = Reverse(str);
		if(s.equalsIgnoreCase(str))
		{
			System.out.println("Given string is Plaindrome");
		}
		else
		{
			System.out.println("Given string is not a Palindrome");
		}
	}
}
