import java.util.Scanner;

public class LarSmSu {

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
		}}int e=d-1;
		while(b[e]==0)
		{
			e=e-1;
		}
		int sub=b[0]-b[e];
		System.out.println(sub);

	}

}
