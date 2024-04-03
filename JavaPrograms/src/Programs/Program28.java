package Programs;

import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many student details you need to enter");
		int n = sc.nextInt();
		sc.nextLine();
		Student[] std=new Student[n];
		
		for(int i=0;i<n;i++)
		{
			//sc.nextLine();
			System.out.println("Enter name of Student : ");
			String name = sc.nextLine();
			System.out.println("Enter id of the student : ");
			int id = sc.nextInt();
			std[i]=new Student(name, id);
			sc.nextLine();
		}
		
//		for(int i=0;i<n;i++)
//		{
//			std[i].displayData();
//		}
	}	
}
