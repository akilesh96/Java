import java.util.*;
public class NextAndPreviousImmediatePrimeDifference {

    public static void main(String[] args) 
    {
     Scanner s= new Scanner( System.in);
		int n=s.nextInt(),n1=n,n2=n;
		int pf=0;
		int c=0;
		for(int i=1;i<n/2;i++)
		{
		    if(n%i==0)
		    c++;
		}
		if(c==1)
		pf=1;
		if(pf!=1)
		{
		    int fp=0;c=0;
		    while(fp!=1)
		    {
		        n1++;c=0;fp=0;
		        for(int i=1;i<n/2;i++)
		        {
		            if(n1%i==0)
		            c++;
		        }
		        if(c==1)
		        fp=1;
		        if(n1<10 && c==2)
		        fp=1;
		    }
		    System.out.println(n1);
		    int bf=0;c=0;
		    while(bf!=1)
		    {
		        n2--;c=0;bf=0;
		        for(int i=1;i<n/2;i++)
		        {
		            if(n2%i==0)
		            c++;
		        }
		        if(c==1)
		        bf=1;
		        if(n2<10 && c==2)
		        bf=1;
		    }
		    System.out.println(n2);
		}
		if(pf==1)
	 System.out.println("0");
	 else
	 System.out.println(n1-n2);

	}
}