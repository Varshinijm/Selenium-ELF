package Programs;

public class Program10 {

	public static void main(String[] args) {
		String str="I am a good boy ";
		char[] s = str.toCharArray();
		int count=0;
		int unrepeatedChar=0;
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(s[i]!=s[j] && i!=j)
				{
					count++;
				}
				else if(s[i]==s[j] && i!=j)
				{
					count=0;
					break;
				}
			}
			if(count!=0)
			{
				unrepeatedChar++;
				count=0;
			}
			else
			{
				count=0;
			}
		}
		System.out.println(unrepeatedChar);
	}
}
