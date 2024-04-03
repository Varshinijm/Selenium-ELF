package Programs;

public class Program50 {
	
	public static  int fact(int num)
	{
		if (num == 0)    
		    return 1;    
		  else    
		    return(num * fact(num-1));    
	}

	public static void main(String[] args) {
		
		int num=4;
		int factorial = fact(num);
		System.out.println(factorial);
	}
}
