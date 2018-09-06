import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=1,b=1,k=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print("1 1 ");
		while(k<=n){
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}

	}

}
