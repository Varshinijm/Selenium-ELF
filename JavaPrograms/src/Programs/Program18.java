package Programs;

public class Program18 {

	public static int armstrong(int num,int size)
	{
		int rem=0;
		int fact=1;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			//fact=rem;
			for(int i=1;i<=size;i++)
			{
				fact=fact*rem;
			}
			sum+=fact;
			fact=1;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=153;
		int num1=num;
		int count=0;
		while(num1>0)
		{
			count++;
			num1=num1/10;
		}
		//System.out.println(count);
		int arm = armstrong(num,count);
		if(arm==num)
		{
			System.out.println("Given number is a Armstrong number");
		}
		else
		{
			System.out.println("Given number is not a Armstrong number");
		}
	}
}
