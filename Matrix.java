import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) 
	{
		
		int c;
		Scanner s=new Scanner(System.in);
		c=s.nextInt();
		int i[][]=new int[c][c];
		for(int b=0;b<c;b++)
			for(int j=0;j<c;j++)
			{
				i[b][j]=s.nextInt();
			}
		int sum=0;
		int n=0;
		for(int j=0;j<c;j++)
		{
			sum=sum+i[j][j];
		}
		for(int j=c-1;j>=0;j--)
		{
			if(n==j)
				{n=n+1;
				continue;
				}
			if((n<=c-1)&&(n>=0))
			{
				sum=sum+i[j][n];
				//System.out.println(i[j][n]);
				n=n+1;
			}
		}
				System.out.println(sum);
	}
	

}
