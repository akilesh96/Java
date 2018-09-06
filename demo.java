import java.util.Arrays;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		String a;
        Scanner s=new Scanner(System .in);
        a=s.nextLine();
        int b[]=new int[10];
        int j=0;
        try{
        	for(int i=0;i<a.length();i++)
        	{
           if(a.charAt(i)!=' ')
           {
        	   int n=i;
        	   while(a.charAt(n)!=' ')
        	   {
        		   char v=a.charAt(n);
        		   int h=Character.getNumericValue(v);
        		   if(h<0)
        			   b[j]-=Character.getNumericValue(v);
        		   else
        		       b[j]+=Character.getNumericValue(v);
        		   b[j]*=10;
        		   if(n<a.length())
        		   {n++;}
        		   if(a.charAt(n)==' ')
        			   break;
        	   }
        	   b[j]/=10;
        	   i=n;
        	  j++;
           }
        }
        }
        catch(Exception e){}
        b[j]/=10;
        for(int i=0;i<=j;i++)
        	for(int n=0;n<=j;n++)
        	{
        		if(b[i]<=b[n])
        		{
        			int t=b[i];
        			b[i]=b[n];
        			b[n]=t;
        		}
        	}
        int y=0;
        if(j%2==0)
        {
        for(int i=j;i>=0;i--)
        {
        	
        	System.out.print(b[i]+" ");
        	if(i==y)
        		break;
        	System.out.print(b[y]+" ");
        	y++;
        }
        }
        else{
        	for(int i=j;i>=0;i--)
            {
        		if(i<=y)
            		break;
            	System.out.print(b[i]+" ");
            	System.out.print(b[y]+" ");
            	y++;
        }
        }

	}

}
