import java.util.Arrays;
import java.util.Scanner;

public class sortama {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
			arr[i]=s.nextInt();
		int b=s.nextInt();
		int arr2[]=new int[b];
		for(int i=0;i<b;i++)
			arr2[i]=s.nextInt();
		int sum=a+b;
		int fnal[]=new int[sum];
		int i=0;
		for(;i<a;i++)
			fnal[i]=arr[i];
		for(int j=0;j<b;j++)
		{
			fnal[i]=arr2[j];
			i++;
		}
		Arrays.sort(fnal);
		for(int j=0;j<sum;j++)
			System.out.println(fnal[j]);

	}

}
