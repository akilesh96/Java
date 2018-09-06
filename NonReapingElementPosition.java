import java.util.Scanner;

public class NonReapingElementPosition 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()*2+1,a[] = new int[n],element=0;;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			element ^= a[i];
			System.out.print(element+" ");
		}
		for(int i=0;i<n;i++)
			if(element==a[i])
			{
				System.out.println(i+1);
				break;
			}
	}
}
