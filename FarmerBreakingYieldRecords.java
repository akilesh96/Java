import java.util.LinkedHashSet;
import java.util.Scanner;

public class FarmerBreakingYieldRecords
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),best=0,worst=0,max=0,min=0;
		LinkedHashSet<Integer> h=new LinkedHashSet<>();
		for(int i=0;i<n;i++)
		{
			h.add(s.nextInt());
		}
		int j=0;
		for(int i:h)
		{
			if(j==0)
			{
				max=i;
				min=i;
				j++;
			}
			if(max<i)
			{
				max=i;
				best++;
			}
			if(min>i)
			{
				min=i;
				worst++;
			}
		}
		System.out.println(best+" "+worst);
	}
}
/*
10
3 4 21 36 10 28 30 5 24 42
output 4 0
9
10 5 20 20 4 5 2 25 1
output 2 4
*/