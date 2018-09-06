import java.util.Scanner;
public class ArrayMaximumSumDivisibleByN {
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	int n=s.nextInt();
	String sp[]=a.split("\\s");
	int l=sp.length;
	int num[]=new int[l];
	for(int i=0;i<l;i++)
		num[i]=Integer.parseInt(sp[i]);
	int d=0;
	for(int i=0;i<l;i++)
		if(num[i]%n==0)
			if(d<num[i])
				d=num[i];
	int insum=0;
	for(int i=0;i<l;i++)
		insum+=num[i];
	if(insum%n==0)
		d=insum;
	insum=0;
	for(int i=1;i<l-1;i++)
		for(int j=0;j<l;j++)
		{
			insum=0;
			insum+=num[j];
			for(int k=0;k<l;k+=i)
			{
			if(j==k)
				continue;
			insum+=num[k];
			}
		if(insum%n==0)
			if(d<insum)
				d=insum;
		System.out.print(insum+" ");
		insum=0;
			for(int k=0;k<l;k+=i)
				{
				if(j==k)
					continue;
				insum+=num[k];
				}
			if(insum%n==0)
				if(d<insum)
					d=insum;
		}
	if(d!=0)
	System.out.println("\n"+d);
	else
	System.out.println("-1");
}
}
