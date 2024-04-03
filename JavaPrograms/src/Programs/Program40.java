package Programs;

public class Program40 {

	public static void main(String[] args) {
		int n1=1;
		int n2=1;
		int n3=0;
		System.out.println(n3);
		System.out.println(n2);
		
		int n=10;
		
		for(int i=0;i<n-2;i++)
		{
			n1=n2+n3;
			System.out.println(n1);
			n3=n2;
			n2=n1;
		}
	}
}
