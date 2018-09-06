import java.util.Scanner;

public class Counting1sInTheBinaryNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		int count=0;
		for(long m=n;m>0;m=m/2)
			if(m%2==1)
				count++;
		System.out.println(count);
	}

}
