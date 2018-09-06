import java.util.Scanner;

public class PrimeSilicon {
	static public boolean primes(int num){
		if(num==2)
			return true;
	    for(int i = 2; i < num; i++)
	        if(num % i == 0)
	            return false;
	   return true; 
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=0;
		int i=2,sum=0;
		while(f!=1){
			while(!PrimeSilicon.primes(i))
				i++;
			sum=n+i;
			if(PrimeSilicon.primes(sum))
				f=1;
		}
		System.out.println(i+" "+sum);
	}
}
