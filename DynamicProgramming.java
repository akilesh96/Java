import java.util.Scanner;

public class DynamicProgramming {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),t,inc=0,exc=0;
		int[] num=new int[n];
		for(int i=0;i<n;i++)
		{
			num[i]=s.nextInt();
			if(i==0)
			{
				inc=num[i];
				exc=0;
			}
			else
			{
				t=inc;
				inc=Math.max(inc, exc+num[i]);
				exc=t;
			}
		}
		System.out.println(inc);
	}
}
