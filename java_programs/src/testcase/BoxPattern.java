package testcase;
import java.util.*;
public class BoxPattern {
	public static void main(String [] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
			for(int j=1;j<n-1;j++)
			{
				
				if(i==1 || i==n)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.print("\n");
		}
		
	}
}