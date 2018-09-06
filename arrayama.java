import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class arrayama {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int alen=s.nextInt();
		int arr[]=new int[alen];
		for(int i=0;i<alen;i++)
			arr[i]=s.nextInt();
		int count=0;
		HashSet<Integer> has=new HashSet();
		for(int i=0;i<alen;i++)
			has.add(arr[i]);
		for(int a:has)
		{
			int icount=0;
			for(int i=0;i<alen;i++)
			{
				if(arr[i]==a)
					icount++;
			}
			if(icount>1)
				count++;
		}
		System.out.println(count);
	}

}
