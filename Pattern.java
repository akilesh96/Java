import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		int j;
		Scanner s=new Scanner(System.in);
		j=s.nextInt();
		String a=Integer.toString(j);
		int d=a.length();
		int b[]=new int[d];
		for (int i=0;i<d;i++)
		{
			b[i]=Character.getNumericValue(a.charAt(i));
		}
		for (int i=0;i<d;i++)
			if(i+1<d)
			{
			for(int e=i+1;e<d;e++)
			{
				if(b[i]<=b[e])
				{
					int c=b[e];
					b[e]=b[i];
					b[i]=c;
			    }
		}}
		int n=d-1;
		for(int i=0;i<d/2;i++)
		{
			System.out.print(b[i]);
			if(n>d/2)
			{
				System.out.print(b[n]);
				n--;
			}
		}System.out.print(b[n]);
		
	}

}
