import java.util.Scanner;

public class toll {
	
	    public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int km[]=new int[2];
			for(int i=0;i<2;i++)
			{
			    km[i]=s.nextInt();
			}
			int n;
			n=s.nextInt();
			int k[]=new int[n];
			int m[]=new int[n];
			for(int i=0;i<n;i++)
			{
			    k[i]=s.nextInt();
			}
			for(int i=0;i<n;i++)
			{
			    m[i]=s.nextInt();
			}
			int tm=0;
			int c=km[1];
			int i=0;
			//try{
			while(i<n)
			{
			    int ok=0;
			    if(i==0)
			    {
			        if(c<k[i])
			        {
			        	tm+=m[i];
			            ok=1;
			            c=k[i];
			        }   
			    }
			    else if(c<k[i])
			    {
			        tm+=m[i];
			        ok=1;
			        c=k[i];
			    }
			    if(ok==1)
			    {
			        c+=km[1];
			    }
			    if(i<n)
			    i++;
			}
			//catch(Exception e){}
			System.out.println(tm);

		}
	}
