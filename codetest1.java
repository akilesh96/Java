import java.util.Scanner;

public class codetest1 {

	public static void main(String[] args) 
	{
		int n,n1=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
			{
			if(i%2==1)
			    {   
				System.out.print("*");
				for(int j=1;j<=n1;j++)
				{
					System.out.print(j);
				}
				}
			else if(i%2==0)
			{
				for(int j=n1;j>=1;j--)
				{
					System.out.print(j);
				}
				System.out.print("*");
			}
			n1++;
			System.out.println();
			}
	}

}
