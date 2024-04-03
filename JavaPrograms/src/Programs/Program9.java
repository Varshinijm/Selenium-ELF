package Programs;

public class Program9 {

	public static void main(String[] args) {
		String string=" My name is Khan";
		//string=string.toLowerCase();
		String[] s = string.split("");
		
		int index = 0;
		for(int i=0;i<s.length;i++)
		{
			int j;
			for(j=0;j<i;j++) 
			{
				if(s[i].equalsIgnoreCase(s[j]) && !(s[i].equals(" ")))
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
	}
}
