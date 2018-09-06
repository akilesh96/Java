import java.util.*;
public class DiagonalSum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),num[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				num[i][j]=s.nextInt();
		int sum=0;
		for(int i=0,k=n-1;i<n;i++,k--)
			for(int j=0;j<n;j++)
			{
				if(i==j)
					sum+=num[i][j];
				else if(j==k)
					sum+=num[i][j];
			}
		System.out.println(sum);
	}
}