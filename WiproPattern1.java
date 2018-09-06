import java.util.Scanner;

public class WiproPattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),pri=1;
		for(int i=1;i<=n;i++){
			if(i%2==1){
				for(int j=0;j<i;j++){
					System.out.print(pri++);
					if(j+1<i)
						System.out.print("*");
				}
				System.out.println();
			}
			else{
				pri+=i-1;
				for(int j=0;j<i;j++){
					System.out.print(pri--);
					if(j+1<i)
						System.out.print("*");
				}
				pri+=i+1;
				System.out.println();
			}
		}
		s.close();
	}

}
