import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int con=(n*(n+1))/2,l=0;
		int d=3,p=2;
		for(int k=1;k<=n;k++)
		{
			for(int cap=0;cap<n-k;cap++)
				System.out.print(" ");
		for(int i=0;i<k;i++)
		{
			String dis=Integer.toString(d*p);
			int len=dis.length();
			for(int j=0;j<=5-dis.length()-1;j++)
				System.out.print("0");
			System.out.print(dis+" ");
			d+=4;
			p+=2;
			l=i;
		}
		System.out.println();
		}
	}

}
