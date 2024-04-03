package Programs;

public class Program27 {

	public static void main(String[] args) {
		int arr[]= {-12,34,56,2,1};
		int n=1;
		int length=arr.length;
		int small=0;
		int count=0;
		int smallest=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					small=arr[i];
					count++;
				}
			}
			if(count== length-n)
			{
				smallest=small;
			}
			count=0;
		}
		System.out.println(smallest);
	}
}
