import java.util.Scanner;
public class ArrayElementDivisibleByD 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),num[]=new int[n];
		for(int i=0;i<n;i++)
			num[i]=s.nextInt();
		int d=s.nextInt();
		for(int i=0;i<n;i++)
			if(num[i]%d==0)
				System.out.print(num[i]+" ");
	}
}
