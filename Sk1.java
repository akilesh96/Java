import java.util.Arrays;
import java.util.Scanner;

public class Sk1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++)
		num[i]=s.nextInt();
		Arrays.sort(num);
		for(int i:num)
			System.out.print(i+" ");
		int count=0,ic=1,f=1;
		for(int i=0;i<n;i++)
		{
		    if(i+1<n)
		    {
		        if(num[i]+1==num[i+1]||num[i]==num[i+1])
		        {
		            ic++;
		            System.out.println(num[i]+" "+num[i+1]+" "+ic);
		        }
		        else
		        {
		            if(ic>1)
		            count++;
		            ic=1;
		        }
		    }
		}
		if(ic>1)
			count++;
		System.out.println(count);
	}

}
