import java.util.Arrays;
import java.util.Scanner;

public class SortNumbersBasedOnWeight 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int nv[]=new int[n];
		for(int i=0;i<n;i++)
		{
			nv[i]=s.nextInt();
		}
		//Arrays.sort(nv);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(nv[i]>nv[j])
				{
					int t=nv[i];
					nv[i]=nv[j];
					nv[j]=t;
				}
			}
		}
		int nw[]=new int[n];
		int w=0;
		for(int i=0;i<n;i++)
		{
			w=0;
			if(nv[i]%2==0)
				w+=3;
			int sq=(int)Math.sqrt(nv[i]);
			if(sq*sq==nv[i])
				w+=5;
			if(nv[i]%4==0 && nv[i]%6==0)
				w+=4;
			nw[i]=w;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(nw[i]>nw[j])
				{
					int t=nw[i];
					nw[i]=nw[j];
					nw[j]=t;
					int t1=nv[i];
					nv[i]=nv[j];
					nv[j]=t1;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(nv[i]);
		}
	}

}
