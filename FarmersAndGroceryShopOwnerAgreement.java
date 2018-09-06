import java.util.ArrayList;
import java.util.Scanner;

public class FarmersAndGroceryShopOwnerAgreement 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),num[]=new int[n];
		for(int i=0;i<n;i++)
			num[i]=s.nextInt();
		ArrayList<Integer> a1=new ArrayList<>(),a2=new ArrayList<>();
		int max=num[n-1],count=0,mc=count;
		for(int i=n-1;i>=0;i--)
		{
			if(num[i]>max)
			{
				a1.add(max);
				int add=0,f=0;
				if(a1.size()!=0)
				for(int j=0;j<a1.size();j++)
					if(max==a1.get(j))
					{
						add=a2.get(j)+count;
						a2.add(j,add);
						count=1;
						if(mc<add)
							mc=add;
						max=num[i];
						f=1;
					}
				if(f==1)
					break;
				a2.add(count);
				if(mc<count)
					mc=count;
				count=1;
				max=num[i];
			}
			else
				count++;
		}
		System.out.println(a1);
		System.out.println(a2);
		for(int i=a2.size()-1;i>=0;i--)
		{
			if(a2.get(i)==mc)
			{
				System.out.println(a1.get(i));
				break;
			}
		}
	}
}
/*
7
90 70 60 72 65 75 85
7
100 80 90 95 90 82 93
*/
