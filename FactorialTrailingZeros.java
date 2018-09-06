import java.util.Scanner;
public class FactorialTrailingZeros {

    public static void main(String[] args) 
    {
     Long n;
     Scanner s=new Scanner (System.in);
     n=s.nextLong();
     long fac=(long)1;
     long count=0;
     for (long i=(long)5;n/i>=1;i*=5)
     {
    	count+=n/i;
     }
     System.out.println(count);
	}
}