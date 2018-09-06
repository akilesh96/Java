import java.util.Scanner;

public class ShirtMatchingPairs
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),num[]=new int[n],count=0;
		for(int i=0;i<n;i++)
			num[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(num[i]==0)
				continue;
			for(int j=0;j<n;j++)
			{
				if(num[j]==0 || i==j)
				continue;
				if(num[i]==num[j])
				{
					count++;
					num[i]=num[j]=0;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
/*
9
10 20 20 10 10 30 44 10 20
o/p 3
6
42 44 40 42 44 42
o/p 2
*/