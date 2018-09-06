import java.util.Scanner;

public class MixedPatternPrinting {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),j=n,i=1,count=0;
		for(;i<=n;j--,i++)
		{
			System.out.print(i+" ");
			count++;
			if(count==n)
				break;
			System.out.print(j+" ");
			count++;
			if(count==n)
				break;
		}
	}

}
