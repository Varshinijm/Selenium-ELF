package Programs;

import java.util.Scanner;

public class Program2 {

	public static String ReverseNum(long num)
	{
		String rev="";
		while(num>0)
		{
			long rem=num%10;
			rev = rev+""+rem;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println("Enter the Number to be reversed");
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		System.out.println(ReverseNum(num));
	}
}
