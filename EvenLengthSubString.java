import java.util.Scanner;

public class EvenLengthSubString 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int strlen=str.length(),f=-1;
		String fstr="";
		for(int i=0;i<strlen-1;i++)
		{
			for(int j=1;j<=strlen/2;j++)
			{
				if(i+j+j<=strlen)
				{
					String sub1=str.substring(i,i+j);
					String sub2=str.substring(i+j,i+j+j);
					int sum1=0,sum2=0;
					for(int k=0;k<sub1.length();k++)
					{
						sum1+=Character.getNumericValue(sub1.charAt(k));
						sum2+=Character.getNumericValue(sub2.charAt(k));
					}
					if(sum1==sum2)
					{
						f=1;
						String check=sub1.concat(sub2);
						if(fstr.length()<check.length())
							fstr=check;
					}
				}
			}
		}
		if(f!=-1)
			System.out.println(fstr);
		else
			System.out.println("-1");
	}

}
