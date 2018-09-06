import java.util.*;
public class FindLockerStatus 
{
	public static void main(String arr[])
	{
		Scanner s=new Scanner(System.in);
		String line;
		int n;
		int l;
		n=s.nextInt();
		l=s.nextInt();
		String st[]=new String[l+1];
		for(int i=0;i<=l;i++)
		{
			st[i]="Open";
		}
		for(int j=2;j<=n;j++)
		for(int i=1;i*j<=l;i++)
		{
			if(st[i*j]=="Open")
				st[i*j]="Closed";
			else
				st[i*j]="Open";
		}
		System.out.println(st[l]);
	}
}
