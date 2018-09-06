import java.util.Scanner;

public class UnNamed1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),changes=s.nextInt();
		int a[]=new int[n],b[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
			b[i]=s.nextInt();
		int sum=0,dis=Integer.MAX_VALUE;
		for(int k=0;k<2;k++)
		{
			int t=2;
			if(k==1)
				t=-2;
		for(int j=0;j<n;j++)
		{
			sum=0;
			sum+=(a[j]+(changes*t))*b[j];
		for(int i=0;i<n;i++)
		{
			if(i==j)
				continue;
			sum+=a[i]*b[i];
		}
		if(sum<dis)
			dis=sum;
		}
		}
		System.out.println(dis);
	}

}
/*
3 5
1 2 -3
-2 3 -5
*/