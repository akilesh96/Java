import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class MinimumPurchaseCountFreeOffer 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),display=0;
		TreeSet<Integer> has=new TreeSet<Integer>();
		for(int i=0;i<n;i++)
			has.add(s.nextInt());
		Object arr[]=has.toArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=="#")
				continue;
			int a=(int)arr[i],count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]=="#")
					continue;
				int b=(int)arr[j];
				if(a+1==b || a+2==b || a+3==b || a+4==b)
				{
					count++;
					arr[j]="#";
				}
			}
			//if(count>0)
				display++;
			arr[i]="#";
		}
		System.out.println(display);
	}
}
