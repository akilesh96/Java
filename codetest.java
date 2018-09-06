import java.util.Scanner;

public class codetest {

	public static void main(String[] args)
	{
		int n,j,k,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int ar[]=new int[n];
		for(j=0;j<n;j++)
		{
			ar[j]=s.nextInt();
		}
		int arr[]=new int[n];
		for(j=0;j<n;j++)
		{
			arr[j]=ar[j];
		}
		
		for(j=0;j<n;j++)
		{
			for(k=1;k<n;k++)
			{
				if(arr[j]<=arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		for(j=0;j<n;j++)
		{
			if(ar[j]==arr[0])
			System.out.print(arr[1]+" ");
			else if(ar[j]==arr[1])
				System.out.print(arr[0]+" ");
			else if(true)
				System.out.print(ar[j]+" ");
	    }

}
}
