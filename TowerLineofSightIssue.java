import java.util.*;
import java.util.Arrays;
public class TowerLineofSightIssue {

    public static void main(String[] args) {
		int x[]=new int[4];
		int y[]=new int[4];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
		    x[i]=s.nextInt();
		    y[i]=s.nextInt();
		    x[i]+=500;
		    y[i]+=500;
		}
		    int xs=x[0];
		    int xe=x[2];
		    int ys=y[0];
		    int ye=y[2];
		    int xf=0,yf=0,f=0;
		    if(xs>xe)
		    {
		        int t=xe;xe=xs;xs=t;
		    }
		    if(ys>ye)
		    {
		        int t=ye;ye=ys;ys=t;
		    }
		    for(int k=1;k<4;k+=2){
		    for(int j=xs;j<=xe;j++)
		    {
		        if(x[k]==j)
		        {xf=1;}
		    }
		    for(int j=ys;j<=ye;j++)
		    {
		        if(y[k]==j)
		        {yf=1;}
		    }
		    if(xf==1&&yf==1)
		    f+=1;
		    System.out.println(f);
		        xf=0;yf=0;
		    }
		    xs=x[1];xe=x[3];ys=y[1];ye=y[3];
		    if(xs>xe)
		    {
		        int t=xe;xe=xs;xs=t;
		    }
		    if(ys>ye)
		    {
		        int t=ye;ye=ys;ys=t;
		    }
		    xf=0;yf=0;
		    
		    for(int k=0;k<4;k+=2){
		    for(int j=xs;j<=xe;j++)
		    {
		        if(x[k]==j)
		        {
		            xf=1;
		        }
		    }
		    for(int j=ys;j<=ye;j++)
		    {
		        if(y[k]==j)
		        {
		            yf=1;
		        }
		    }
		        if(xf==1&&yf==1)
		        f=1;
		        if(f==0)
		        	break;
		        xf=0;yf=0;
		    }
		    if(f==1)
		    System.out.print("yes");
		    else
		    System.out.print("no");

	}
}