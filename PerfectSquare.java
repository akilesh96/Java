import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rn=(int)Math.sqrt(n);
		if(rn*rn==n)
			System.out.println("Perfect Square...");
		else
			System.out.println("Not a perfect square...");
	}

}
