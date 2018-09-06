import java.util.Scanner;
public class Reverse {
public static void main(String arg[])
{
	String a;
	Scanner s=new Scanner(System.in);
	a=s.nextLine();
	int c=0;
	for (int i=a.length()-1;i>=0;i--)
	{
		
		c=c+1;
		if(a.charAt(i)==' ')
		{
			c=c-1;
			for(int j=i;j<=c+i;j++)
			{
				System.out.print(a.charAt(j));
			}
			c=0;
		}
		if(i==0)
		{   System.out.print(" ");
			for (int j=i;j<=c+i;j++)
		{
			System.out.print(a.charAt(j));
		}
		}
	}
}
}
