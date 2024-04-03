package Programs;

public class Program23P1 {

	public static void largest(int[] a)
	{
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=large)
			{
				large=a[i];
			}
		}
		System.out.println(large);
	}
	public static void main(String[] args) {
		int[] a= {1,2,0,45,89,1,90,-1,66};
		largest(a);
	}
}
