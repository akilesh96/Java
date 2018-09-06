import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
			num[i]=s.nextInt();
		for(int i=0;i<n;i++)
			for(int j=1;j<n-i;j++)
			{
				if(num[j-1]<num[j])
				{
					int temp=num[j];
					num[j]=num[j-1];
					num[j-1]=temp;
				}
			}
		for(int i:num)
			System.out.print(i+" ");
	}
}
