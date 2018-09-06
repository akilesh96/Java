import java.util.Scanner;

public class Te {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		String m[]=new String[n];
		StringBuilder sb[]=new StringBuilder[n];
		for(int i=0;i<n;i++)
		{
		    m[i]=s.next();
		    sb[i]=new StringBuilder(m[i]);
		}
		String s1,s2;
		s1=s.next();
		s2=s.next();
		int star=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        char f=m[i].charAt(j);
		        if(f=='*')
		        {
		            star++;
		            break;
		        }
		    }
		}
		if(s1.length()!=star)
		{
		    String temp=s1;
		    s1=s2;
		    s2=temp;
		}
		int p1=0,p2=1;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        char f=m[i].charAt(j);
		        if(f=='*')
		        {
		            char t=s1.charAt(p1);
		            sb[i].setCharAt(j,t);
		            m[i]=sb[i].toString();
		            if(p1<s1.length())
		            p1++;
		            break;
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        char f=m[i].charAt(j);
		        if(f=='*')
		        {
		            char t=s2.charAt(p2);
		            sb[i].setCharAt(j,t);
		            m[i]=sb[i].toString();
		            if(p2<s2.length())
		            p2++;
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println(m[i]);
		}
	}

}
