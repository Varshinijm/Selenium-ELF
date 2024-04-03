package Programs;

public class Program6 {

	public static void main(String[] args) {
		int num=5678;
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum);
	}
}
