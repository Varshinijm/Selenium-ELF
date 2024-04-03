package Programs;

import java.util.Scanner;

public class Program1 {
	
	public static void Reverse(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the String to be reversed");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		Reverse(str);	
	}
}
