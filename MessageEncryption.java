import java.util.Scanner;

public class MessageEncryption {
	public static void main(String arg[])
	{
		String m;
		int n;
		Scanner s=new Scanner(System.in);
		m=s.next();
		n=s.nextInt();
		int l=m.length();
		char sh[][]=new char[l/n][n];
		int k=0,ne=0;
		for(int i=0;i<l;i++)
		{
			if(k==n)
				{
				ne++;
				k=0;
				}
			sh[ne][k]=m.charAt(i);
			k++;
		}
		for(int i=0;i<l/n;i++)
		{
			if(i%2==1)
			{
				int r=n-1;
				char d[]=new char[n];
				for(k=0;k<n;k++)
				{
					d[k]=sh[i][k];
				}
				for(int j=0;j<n;j++)
				{
					sh[i][j]=d[r];
					r--;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<l/n;j++)
			{
				System.out.print(sh[j][i]);
			}
		}
	}
}