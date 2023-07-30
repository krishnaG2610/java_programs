package testcase;
import java.util.*;
public class BoxPatternNo {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i);
			for(int j=2;j<=n-1;j++)
			{
				if(i==1)
				{
					System.out.print(j);
				}
				else if(i==n)
				{
		            System.out.print(n+1-j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(n+1-i);
			System.out.print("\n");
		}
	}
}
