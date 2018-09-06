import java.util.*;
public class CharsToRemoveForSameStringValue 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();String st[]=new String[n];
		for(int i=0;i<n;i++)
			st[i]=s.next();
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				for(int j=0;j<st[i].length();j++)
				{
					char s1=st[i].charAt(j);int f=0;
					for(int k=0;k<st[i+1].length();k++)//Comparing first string with next string
					{
						if(s1==st[i+1].charAt(k))
						{
							f=1;
							break;
						}
					}
					if(f!=1)
					{
						System.out.print(s1);
						break;
					}
				}
			}
			else
			{
				for(int j=0;j<st[i].length();j++)
				{
					char s1=st[i].charAt(j);int f=0;
					for(int k=0;k<st[0].length();k++)//comparing with the first given string
					{
						if(s1==st[0].charAt(k))
						{
							f=1;
							break;
						}
					}
					if(f!=1)
					{
						System.out.print(s1);
						break;
					}
				}
			}
		}
	}

}
