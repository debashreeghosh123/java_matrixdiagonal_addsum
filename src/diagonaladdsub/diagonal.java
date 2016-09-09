package diagonaladdsub;

 import java.util.*;
import java.lang.*;

public class diagonal
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		int sum1 = 0;
		int sum2 = 0;
		for(int i =0;i<row;i++)
		{
			for(int j = 0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i =0;i<row;i++)
		{
			for(int j = 0;j<col;j++)
			{
				System.out.print(arr[i][j]);
				
			}
		}
		System.out.println("\n");
		for(int i =1, j = 0;i<row&&j<col-1;i++,j++)
		{
		
				sum1 = arr[i][j]+sum1;
		}
		System.out.println(sum1);
		for(int i =1, j = col-2;i<row&&j>=0;i++,j--)
		{
		
				sum2 = arr[i][j]+sum2;
		}
		System.out.println(sum2);
		int res = sum1-sum2;
		System.out.println("sum difference" +res);


	}
}