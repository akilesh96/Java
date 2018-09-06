import java.util.Scanner;

public class ArrayNextGreaterElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
			num[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i+1<n)
			if(num[i]<num[i+1])
				System.out.print(num[i+1]+" ");
			else
			{
				int f=0;
				for(int j=i+1;j<n;j++)
				{
					if(num[i]<num[j])
					{
						System.out.print(num[j]+" ");
						f=1;
						break;
					}
				}
				if(f==0)
					System.out.print("-1 ");		
			}
		}
		System.out.println("-1");
	}

}
