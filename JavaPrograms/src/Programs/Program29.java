package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Employee details you need to enter");
		int n = sc.nextInt();
		sc.nextLine();
		Employee[] std = new Employee[n];
		ArrayList<Employee> al=new ArrayList<Employee>();

		for (int i = 0; i < n; i++) {
			// sc.nextLine();
			System.out.println("Enter name of Employee : ");
			String name = sc.nextLine();
			System.out.println("Enter id of the Employee : ");
			int id = sc.nextInt();
			System.out.println("Enter Salary of the Employee : ");
			double sal = sc.nextDouble();
			std[i] = new Employee(name, id, sal);
			sc.nextLine();
			al.add(std[i]);

		}
		System.out.println(Arrays.toString(std));
	}
}
