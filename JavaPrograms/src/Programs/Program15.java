package Programs;

public class Program15 {

	public static void main(String[] args) {
		int num=123;
		int n=num;
		int rem=0;
		int num1=0;
		String rev="";
		while(n>0)
		{
			rem=n%10;
			rev+=rem;
			n=n/10;
		}
		num1=Integer.parseInt(rev);
		if(num==num1)
		{
			System.out.println("Given number is a palindrome");
		}
		else
		{
			System.out.println("Given number is not a palindrome");
		}
	}
}
