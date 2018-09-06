import java.util.Arrays;
import java.util.Scanner;

public class NoConsecutiveDigitSubstringCount {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),itr=0;
		String num[]=new String[n];
		for(int i=0;i<n;i++)
			num[i]=s.next();
		while(itr!=n)
		{
		int len=num[itr].length();
		int c=len;
		for(int i=2;i<len+1;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(j+i-1<len){
				String sub=num[itr].substring(j,j+i);
				int sublen=sub.length(),arr[]=new int[sublen];
					int k,f=0;
		        for(k=1;k<sub.length();k++)
		        {
		            if(sub.charAt(k) == sub.charAt(k-1))
		            {
		                break;
		            }
		        }
		        if(k==sub.length())
		                f=1;
				if(f==1)
					c++;}
			}
		}
		System.out.println(c);
		itr++;
		}
	}

}
/*
3
14886
1988427932634421047856419284696328832732837
776
*/