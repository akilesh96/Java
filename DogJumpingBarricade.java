import java.util.Scanner;

public class DogJumpingBarricade 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		StringBuilder sb=new StringBuilder();
		while(d!=0)
		{
			int x=s.nextInt(),y=s.nextInt(),n=s.nextInt(),arr[]=new int[n],dis=0;
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();
			for(int i=0;i<n;i++)
			{
				int c=0,f=0;
				while(f!=1)
				{
					dis++;
					c+=x;
					if(arr[i]<=c)
						f=1;
					c-=y;
				}
			}
			//System.out.print(dis+" ");
			sb.append(dis+" ");
			d--;
		}
		String dis[]=sb.toString().split("\\s+");
		for(String i:dis)
			System.out.println(i);
	}

}
/*
2
10 2 4
5 14 19 22
4 1 5
6 9 11 4 6
*/