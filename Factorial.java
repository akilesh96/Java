import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new 	Scanner(System.in);
		int n=s.nextInt();
		long res=1;
		for(int i=1;i<=n;i++)
			res*=i;
		System.out.println(res);

	}

}
