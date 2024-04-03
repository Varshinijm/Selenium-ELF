package Programs;

public class Program16 {

	public static void main(String[] args) {
		int num=7;
		int i=2;
		int flag=0;
		while(i<num)
		{
			if(num%i==0)
			{
				System.out.println("Given number is not a prime number");
				flag=1;
				break;
			}
			i++;
		}
		if(flag==0)
		{
			System.out.println("Given number is a prime number");
		}
	}
}
