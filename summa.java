import java.util.Scanner;
public class summa 
{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),num[]=new int[n];
	for(int i=0;i<n;i++)
	num[i]=s.nextInt();
	 int cj,ci=0,index=0;
	    for(int i=n-1; i>=0; i--)
	    {
	        cj=0;
	        for(int j=i-1; j>=0; j--)
	        {
	            if(num[j] < num[i])
	                cj++;
	            else
	                break;
	        }
	        if(cj >= ci)
	        {
	            ci=cj;
	            index=num[i];

	        }
	    }
	System.out.println(index);
}
}
