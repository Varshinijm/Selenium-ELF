package Programs;

public class Program53 {

	public static void main(String[] args) {
		int n=4;
		for(int row=1;row<=n;row++)
		{
			for(int space=row;space<=n-1;space++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=2*row-1;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=n-1;row>=1;row--)
		{
			for(int space=row;space<=n-1;space++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=2*row-1;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
