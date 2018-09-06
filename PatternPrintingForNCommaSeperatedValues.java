import java.util.*;
//Also check ReversePatternPrintingNumber in skillrack folder in F drive
public class PatternPrintingForNCommaSeperatedValues {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String in=s.next();
		String sp[]=in.split(",");
		int arr[]=new int[sp.length];
		for(int i=0;i<sp.length;i++)
			arr[i]=Integer.parseInt(sp[i]);
		int n=1,f=0;
		while(f!=1)
		{
			if(2*sp.length==(n*n+n))
				f=1;
			if(f!=1)
			n++;
		}
		for(int i=0,j=1;i<n&&j<=n;i++,j++)
		{
			int len=n,temp=i;
			for(int k=0;k<j;k++)
			{
				System.out.print(arr[temp]+" ");
				len--;
				temp+=len;
			}
			System.out.println();
		}
	}

}
