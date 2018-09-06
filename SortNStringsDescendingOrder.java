import java.util.Arrays;
import java.util.Scanner;

public class SortNStringsDescendingOrder {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str[]=new String[n];
		int num[]=new int[n];
		for(int i=0;i<n;i++)
			str[i]=s.next();
		Arrays.sort(str);
		for(int i=str.length-1;i>=0;i--)
			System.out.println(str[i]);
	}

}
