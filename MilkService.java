import java.util.Scanner;

public class MilkService {
	public static void main(String arr[])
	{
		int l,s;
		Scanner si=new Scanner(System.in);
		l=si.nextInt();
		int c=0;
		s=l/10;
		int r10=l%10;
		if(s!=0)
		{
			c+=s;
		}
		int r7=r10%7;
		if((r10/7)!=0)
		r10/=7;
		else
		r10=0;
		if(r10!=0)
		{
			c+=r10;
		}
		int r5=r7%5;
		if((r7/5)!=0)
		r7/=5;
		else
			r7=0;
		if(r7!=0)
		{
			c+=r7;
		}
		if(r5<=4)
		{
			c+=r5;
		}
		System.out.println(c);
	}

}
