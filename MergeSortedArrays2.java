import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MergeSortedArrays2 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine(),s2=s.nextLine();
		String sp1[]=s1.split("\\s+");
		String sp2[]=s2.split("\\s+");
		int len=sp1.length+sp2.length;
		int i=0,arr[]=new int[len];
		for(i=0;i<len;i++)
		{
			if(i<sp1.length)
			arr[i]=Integer.parseInt(sp1[i]);
			else
				arr[i]=Integer.parseInt(sp2[i-sp1.length]);
		}
		Arrays.sort(arr);
		for (i = 0; i < len; i++) {
		      for (int j = i + 1; j < len;) {
		         if (arr[j] == arr[i]) {
		            for (int k = j; k+1 < len; k++) {
		               arr[k] = arr[k + 1];
		            }
		            len--;
		         } else
		            j++;
		      }
		}
		for(i=0;i<len;i++)
			System.out.print(arr[i]+" ");
		   
	}
}
