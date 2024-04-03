package Programs;

public class Program32 {

	public static void main(String[] args) {
		String str="aaaabbbccc";
		char[] ch = str.toCharArray();
		String str1="";
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
				
			}
			if(str1.indexOf(ch[i])==-1)
			{
				str1=str1+ch[i]+count;
			}
			//System.out.println(count);
			count=0;
		}
		if(str.length()<str1.length())
		{
			System.out.println(str);
		}
		else
		{
			System.out.println(str1);
		}
	}
}
