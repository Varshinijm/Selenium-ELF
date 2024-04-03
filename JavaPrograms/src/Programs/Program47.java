package Programs;

import java.util.Scanner;

public class Program47 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size of an array");
		int row = sc.nextInt();
		System.out.println("Enter the coloumn size of an array");
		int col = sc.nextInt();
		int[][] arr= new int[row][col];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				int num = sc.nextInt();
				arr[i][j]=num;
			}
		}
		
		System.out.println("Original matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		int[][] arr1=new int[col][row];
		
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				arr1[i][j]=arr[j][i];
			}
			//System.out.println();
		}
		System.out.println("Transpose of the matrix");
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(arr1[i][j]);			
			}
			System.out.println();
		}
	}
}
