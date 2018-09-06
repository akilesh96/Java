import java.util.*;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) 
	{
		String s;
		Scanner S=new Scanner(System.in);
		s=S.next();
		int l=s.length();
		StringBuilder sb=new StringBuilder(s);
		int found=0;
		int num[]=new int[50];
		int count=0,i=3;
		while(found!=1)
		{
			if(i==1)
			{
				count=0;
				for(int j=0;j<l;j++)
				{
					char a=(s.charAt(j));
					if(j+1<l)
					{
					char b=(s.charAt(j+1));
					if(a+1==b || a+2==b)
					{
						count++;
					}
					}
				}
				if(count-1==l)
				found=1;
				i++;
			}
			if(i!=1)
			{
				count=0;
			for(int j=0;j<l;j++)
			{
				CharSequence cseq1,cseq2;
				int an=0,k=j;
				if(j+i<l)
				{
				cseq1=sb.subSequence(j,j+=i);
				String a=cseq1.toString();
				an=Integer.parseInt(a);
				System.out.println(a);}
				int bn=0;
				//j++;
				if((j+i)<l)
				{
					cseq2=sb.subSequence(j, j+=i);
					String b=cseq2.toString();
					bn=Integer.parseInt(b);
					System.out.println(bn);
				}
				if(an+1==bn || an+2==bn)
				{
					count++;
				}
				j=k+i;
				
			}
			i++;
			if(i==3)
				found=1;
			}
		}
		System.out.println(count+" "+l);
	}

}
