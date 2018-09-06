import java.util.Scanner;

public class QuickSort 
{
	static void qsort(int low,int high,int arr[])
	{
		int i=low,j=high;
		int pivot=arr[low+(high-low)/2];
		while(i<=j)
		{
			while(arr[i]<pivot)i++;
			while(arr[j]>pivot)j--;
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j)
			qsort(low,j,arr);
		if(i<high)
			qsort(i,high,arr);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
			num[i]=s.nextInt();
		qsort(0,n-1,num);
		for(int i:num)
			System.out.print(i+" ");
	}
}
