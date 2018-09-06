import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortOddAndEvenAscending 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> al=new ArrayList();
		for(int i=0;i<n;i++)
			al.add(s.nextInt());
		ArrayList<Integer> al1=new ArrayList(al);
		Collections.sort(al1);
		int ei=0,oi=0;
		for(int i:al)
		{
			int f=0;
			if(i%2==0)
			{
				while(f!=1)
				{
					if(al1.get(ei)%2==0)
						f=1;
					ei++;
				}
				System.out.print(al1.get(ei-1)+" ");
			}
			else
			{
				while(f!=1)
				{
					if(al1.get(oi)%2==1)
						f=1;
					oi++;
				}
				System.out.print(al1.get(oi-1)+" ");
			}
		}
	}
}
/*
9
169 181 298 16 147 263 102 155 141
*/