import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=n;
		String str=""+n;
		long res=0;
		for(int i=0;i<str.length();i++){
			int digit=n%10;
			long temp=(long)(Math.pow(digit,str.length()));
			res+=temp;
			n/=10;
		}
		if(t==res)
			System.out.println("Armstrong");
		else 
			System.out.println("Not a Armstrong");

	}

}
