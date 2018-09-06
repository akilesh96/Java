import java.util.*;
public class FillingCans {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();
		int sum=0;
		if(x<y)
		{
			int temp=y;
			y=x;
			x=temp;
		}
		int c=1,f=0;
		while(f!=1)
		{
			x-=y;
			if(x==z)
				f=1;
			else
				c++;//To pour water outside
			if(x<0)
			{
				f=0;break;
			}
			c++;//To increment step
		}
		if(f==1)
			System.out.println(c);
		else
			System.out.println("-1");
	}

}
