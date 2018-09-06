import java.util.Scanner;

public class MultiLayeredDiamondShapedRhombusPattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=2*s.nextInt();
		int start=n/2,end=n/2+1;
		for(int i=1;i<=n;i++)
		{
			int f=0,st=start,en;
			if(i%2==0)
				en=n/2+2;
			else
				en=n/2+1;
			if(i>n/2)
			    f=1;
			if(f==1 && i%2==0)
			{
				en=n/2+1;
			}
			if(f==1 && i%2==1)
				en=n/2+2;
			for(int j=1;j<=n;j++)
			{
				if(j==st && f==0){
				System.out.print("/");
				if(st+2<=n/2)
					st+=2;
				}
				else if(j==st && f==1){
						System.out.print("\\");
						if(st+2<=n/2)
							st+=2;
						}
				else if(j==en&&f==0){
					System.out.print("\\");
					if(en+2<=end)
						en+=2;
				}
				else if(j==en&&f==1){
					System.out.print("/");
					if(en+2<=end)
						en+=2;
				}
				else
					System.out.print("#");
			}
			//System.out.println(start+","+end);
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
		}
	}
}
/*
####/\####
###/##\###
##/#/\#\##
#/#/##\#\#
/#/#/\#\#\
\#\#\/#/#/
#\#\##/#/#
##\#\/#/##
###\##/###
####\/####
 */