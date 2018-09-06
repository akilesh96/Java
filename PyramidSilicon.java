import java.util.Scanner;

public class PyramidSilicon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int left=n,right=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=2*n-1;j++){
				if(j>=left&&j<=right)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			left--;
			right++;
			System.out.println();
		}
	}

}
/*
   *
  ***
 *****
*******
*/