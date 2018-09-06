import java.util.*;
public class LargestAndSmallestDigitsDifference 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String n=s.next();
		int len=n.length();
		int num[]=new int[len];
		for(int i=0;i<len;i++)
			num[i]=Character.getNumericValue((n.charAt(i)));
		Arrays.sort(num);
		System.out.println(num[len-1]-num[0]);		
	}

}
