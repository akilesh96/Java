import java.util.Scanner;
public class ForwardAndReverse 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1,j=n;j>=1;i++,j--)
			System.out.print(i+" "+j+" ");
	}
}
