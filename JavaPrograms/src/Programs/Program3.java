package Programs;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		String string="Java is a programing language";
		char[] s = string.toCharArray();
		
		int index = 0;
		for(int i=0;i<s.length;i++)
		{
			int j;
			for(j=0;j<i;j++) 
			{
				if(s[i]==s[j])
				{
					break;
				}
			}
			if(i==j)
			{
				s[index++]=s[i];
			}
		}
		for(int i=0;i<index;i++)
		{
			System.out.print(s[i]);
		}
		System.out.println();
		//System.out.println(String.valueOf(Arrays.copyOf(s, index)));
	}
}
