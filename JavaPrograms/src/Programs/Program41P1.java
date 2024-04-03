package Programs;

public class Program41P1 {

	public static boolean Prime(int num) {
		int flag = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = 1;
			}
		}
		if (flag == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int nth = 10;
		int count = 0;
		int num=1;
		boolean n = false;
		while(count<nth)
		{
			num=num+1;
			boolean res = Prime(num);
			if(res==true)
			{
				count++;
			}
		}
		System.out.println(num);
		
	}
}
