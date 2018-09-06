import java.util.Scanner;

public class String2DArraySubStringSearch 
{

	public static void main(String[] args) 
	{
		String s,sub;
		int c,k=0,is=0,ie=0,js=0,je=0,f=0,bf=0;
		Scanner S=new Scanner(System.in);
		s=S.next();
		sub=S.next();
		c=S.nextInt();
		int l=s.length();
		char st[][]=new char[l/c+1][c];
		for(int i=0;i<l/c+1;i++)
		{
			for(int j=0;j<c;j++)
			{
				st[i][j]=s.charAt(k);
				k++;
				if(k==l)
					break;
			}
			if(k==l)
				break;
		}
		for(int i=0;i<c;i++)
		{
			k=0;f=0;int so=0,si=0;
			char d=sub.charAt(k);
			for(int j=0;j<l/c+1;j++)
			{
				so++;
				if(k<sub.length())
				d=sub.charAt(k);
				if(st[j][i]==d)
				{
					if(k>0)
					{
						if(si!=so)
							bf=1;
					}
					if(k==0)
					{
						is=j;
						si=so;
					}
					k++;
					si++;
					f++;
				}
				if(f==sub.length())
				{
					ie=j;
					je=i;
					js=i;
					break;
				}
			}
			if(f==sub.length())
				break;
		}
		if(f!=sub.length())
		{
			for(int i=0;i<l/c;i++)
			{
				k=0;f=0;
				char d=sub.charAt(k);
				for(int j=0;j<c;j++)
				{
					if(k<sub.length())
						d=sub.charAt(k);
						if(st[i][j]==d)
						{
							if(k==0)
								js=j;
							k++;
							f++;
						}
						if(f==sub.length())
						{
							ie=i;
							je=j;
							is=i;
							break;
						}
				}
				if(f==sub.length())
					break;
			}
		}
		if(f==sub.length() && bf==0)
		System.out.println(is+","+js+"\n"+ie+","+je);
		else
			System.out.println("-1");
	}

}