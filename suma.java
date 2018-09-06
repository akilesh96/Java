import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		int j=715289;
		String a=Integer.toString(j);
		int d=a.length();
		int b[]=new int[d];
		for (int i=0;i<d;i++)
		{
			b[i]=Character.getNumericValue(a.charAt(i));
		}
		System.out.println(b[0]);


	}

}
