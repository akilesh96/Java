import java.util.Scanner;

public class Prime {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int isprime[]=new int[n+1];
		for(int i=2;i<n+1;i++)
			isprime[i]=1;
		for(int i=2;i*i<=n;i++)
		{
			for(int j=i;j*i<=n;j++)
			{
				isprime[j*i]=0;
			}
		}
		for(int i=2;i<n+1;i++)
			if(isprime[i]==1)
				System.out.print(i+" ");
	}
}
