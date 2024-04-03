package Programs;

public class Program17 {

	public static int  Strong(int num)
	{
		int rem=0;
		int fact=1;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			fact=1;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=145;
		int strong = Strong(num);
		if(num==strong)
		{
			System.out.println("Given number is a Strong number");
		}
		else
		{
			System.out.println("Given number is not a Strong number");
		}
		
	}
}
