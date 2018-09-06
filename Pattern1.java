import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int i;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		for(int j=1;j<=i;j++)
		{
			for(int c=1;c<=j;c++)
			{
				System.out.print(c+" ");
			}System.out.println();
		}

	}

}
