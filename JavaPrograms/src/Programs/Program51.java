package Programs;

public class Program51 {

	public static  int sum(int num)
	{
		if (num == 1)    
		    return 1;    
		  else    
		    return(num + sum(num-1));    
	}

	public static void main(String[] args) {
		
		int num=10;
		int summation = sum(num);
		System.out.println(summation);
	}
}
