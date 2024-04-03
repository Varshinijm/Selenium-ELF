package Programs;

public class Program25 {

	public static boolean search(int[] a,int key)
	{
		int flag = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) {
		int[] a= {12,32,1,2,43};
		int key=32;
		boolean res=search(a,key);
		if(res)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
}
