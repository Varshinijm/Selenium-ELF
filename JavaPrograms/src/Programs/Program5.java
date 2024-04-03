package Programs;

public class Program5 {

	public static void main(String[] args) {
		String str="asc123bsd45gfy7";
		String s="";
		int rem=0;
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>'0' && str.charAt(i)<'9')
			{
				s=s+str.charAt(i);
			}
		}
		int num=Integer.parseInt(s);
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
