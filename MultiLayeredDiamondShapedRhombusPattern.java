import java.util.*;
public class MultiLayeredDiamondShapedRhombusPattern {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()*2;
		int start=n/2,end=n/2+1;
		for(int i=1;i<=n;i++)
		{
		    int f=0,start1=start,end1=end;
		    if(i>n/2)
		    f=1;
		    for(int j=1;j<=n;j++)
		    {
		        int inf=0;
		        if(j==start1 && f==0){
		        System.out.print("/");
		            inf=1;
		        }
		        else if(j==start1 && f==1){
		        System.out.print("\\");
		        inf=1;
		        }
		        else if(j==end1 && f==0){
		        System.out.print("\\");
		            inf=1;
		        }
		        else if(j==end1 && f==1){
		        System.out.print("/");
		        inf=1;
		        }
		        else
		        System.out.print("#");
		        if(f==0&&inf==1)
		        {
		            if(start1+2<=n/2)
		            start1+=2;
		            if(end1==n+6)
		            end-=2;
		        }
		    }
		    System.out.println();
		    if(f==0){
		    start--;
		    end++;}
		    else
		    {
		        start++;
		        end--;
		    }
		    if(i==n/2)
		    {
		        start++;
		        end--;
		    }
		    //System.out.println(start+" "+end);
		}
		System.out.println("Hi");
	}
}
//MultiLayeredDiamondShapedRhombusPattern