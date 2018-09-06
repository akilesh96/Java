import java.util.*;
public class PatternPrintingNLines {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),st=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(st+" ");
				st++;
			}
			System.out.println();
		}
	}

}
