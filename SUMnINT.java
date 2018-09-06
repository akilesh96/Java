import java.util.*;
public class SUMnINT {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
			num[i]=s.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    if(num[i]>0)
		    {
		        if(num[i]%2==0)
		        {
		            String str=Integer.toString(num[i]);
		            StringBuilder sb=new StringBuilder(str);
		            sb.reverse();
		            str=sb.toString();
		            int nu=Integer.parseInt(str);
		            sum+=nu;
		        }
		        else
		        sum+=num[i];
		        System.out.println(sum);
		    }
		}
		System.out.println(sum);
	}
}