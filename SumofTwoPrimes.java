import java.util.*;
public class SumofTwoPrimes 
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt(),sum=0,n[]=new int[t];
		for(int i=0;i<t;i++)
		{
			n[i]=s.nextInt();
			if(sum<n[i])
				sum=n[i];
		}
		int plen=0,pn[]=new int[(int)Math.sqrt(sum+1000)];
		pn[0]=2;pn[1]=3;pn[2]=5;pn[3]=7;
		plen=4;
		for(int i=10;i<=Math.sqrt(sum+1000)+1;i++)
		{
			int f=0;
			for(int j=2;j<Math.sqrt(i);j++)
			{
				if(i%j==0)
					f=1;
			}
			if(f!=1)
			{
				pn[plen]=i;
				plen++;
			}
		}
		int i=0;
		while(i!=t)
		{
			int f=0;
			for(int j=0;j<plen;j++)
			{
				int find=n[i]-pn[j];
				for(int k=0;k<plen;k++)
					if(find==pn[k])
						f=1;
				if(f==1)
					break;
			}
			if(f==1)
				System.out.println("yes");
			else
				System.out.println("no");
			i++;
		}
	}
}
