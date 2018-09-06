import java.util.*;
public class MatrixFillsTwoWords {

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
        int  p1=0,p2=0;
		int c=0,r=0,found=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        char f=m[i].charAt(j);
		        if(f=='*')
		        {
		            j++;
		            char t=m[i].charAt(j);
		            if(t=='*')
		            {found=1;
		            r=i;
		            }
		            j--;
		        }
		        if(found==1)
		        break;
		    }
		}
		System.out.println(r);
		found=0;
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            char f=m[i].charAt(j);
		            if(f=='*')
		            {
		               i++;
		               char t=m[i].charAt(j);
		               if(t=='*')
		               {
		                   found=1;
		                   c=j;
		               }
		               else
		               {
		                   i--;
		               }
		            }
		        }
		        if(found==1)
		        break;
		    }
		    System.out.println(c);
		    for(int j=0;j<n;j++)
		    {
		        if(m[r].charAt(j)=='*')
		        {char t=s2.charAt(p2);
		        sb[r].setCharAt(j,t);
		        if(p2+1<s2.length())
		        p2++;}
		    }
		    p2=0;
		    found=0;
		    //m[r]=sb[r].toString();
		    int fc=0;
		    for(int i=0;i<n;i++)
		    {
		        fc=0;
		    	char f=m[i].charAt(c);
		        if(f=='*')
		        {if(i==r)
		        {
		            if(sb[i].charAt(c)==s1.charAt(p1))
		            {
		            	fc=1;
		            }
		        else{
		            found=1;
		            String temp=s1;
		            s1=s2;
		            s2=temp;
		            p2=0;
		            for(int j=0;j<n;j++)
		            {
		                if(m[r].charAt(j)=='*'){
		                char t=s2.charAt(p2);
		                sb[r].setCharAt(j,t);
		                if(p2+1<s2.length())
		                {p2++;}}
		            }
		            //m[r]=sb[r].toString();
		            p1=0;
		            for(int i1=0;i1<n;i1++)
		            {
		                char h=m[i1].charAt(c);
		                if(h=='*')
		                {
		                    if(i1==r)
		                    {
		                    	p1++;
		                    	continue;
		                    }
		                    char t=s1.charAt(p1);
		                    sb[i1].setCharAt(c,t);
		                    if(p1+1<s1.length())
		                    {p1++;}
		                   // m[i1]=sb[i1].toString();
		                }
		            }
		        }}
		        if(found==1)
		        break;
		        if(fc==1)
		        {
		        	p1++;
		        	continue;
		        }
		        char t=s1.charAt(p1);
		        sb[i].setCharAt(c,t);
		        if(p1+1<s1.length())
		        {p1++;}
		        //m[i]=sb[i].toString();
		        }
		        
		    }
		    p1=0;
		    for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<n;j++)
		    	{
		    		if(sb[i].charAt(j)=='*')
		    		{
		    			char t=s1.charAt(p1);
		    			if(p1+1<s1.length())
		    			p1++;
		    			sb[i].setCharAt(j,t);
		    		}
		    	}
		    }
		    for(int i=0;i<n;i++)
		    {
		        m[i]=sb[i].toString();
		    	System.out.println(m[i]);
		    }

	}
}