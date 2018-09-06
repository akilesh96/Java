import java.util.*;
public class MergeSortedArrays3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine(),s2=s.nextLine();
		String sp1[]=s1.split("\\s+");
		String sp2[]=s2.split("\\s+");
		int len=sp1.length+sp2.length;
		int i=0;String arr[]=new String[len];
		System.arraycopy(sp1,0,arr,0,sp1.length);
		System.arraycopy(sp2,0,arr,sp1.length,sp2.length);
		int farr[]=new int[len];
		for(i=0;i<len;i++)
		{
			farr[i]=Integer.parseInt(arr[i]);
		}
		Arrays.sort(farr);
		for (i = 0; i < len; i++) {
		      for (int j = i + 1; j < len;) {
		         if (farr[j] == farr[i]) {
		            for (int k = j; k+1 < len; k++) {
		               farr[k] = farr[k + 1];
		            }
		            len--;
		         } else
		            j++;
		      }
		}
		for(i=0;i<len;i++)
			System.out.print(farr[i]+" ");
	}
}