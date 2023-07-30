package testcase;
import java.util.*;
public class TestCase6 {
	public static void main(String [] args) {
		int sum=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int m=sc.nextInt();
		System.out.println(" enter a value");
		int n=sc.nextInt();
		System.out.println("enter a value:");
		int p=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			b=i;
			while(b>0)
			{
				
				sum=sum+b%10;
				b=b/10;
				
	         }
			if(sum==p)
			{
				System.out.print(i+" ");
			}
			sum=0;
		}
	}
}
