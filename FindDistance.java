import java.util.Scanner;

public class FindDistance {

	public static void main(String[] args) 
	{
		int x1,x2,y1,y2;
		Scanner s=new Scanner(System.in);
		x1=s.nextInt();
		x2=s.nextInt();
		y1=s.nextInt();
		y2=s.nextInt();
		double d=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
	    int a=(int) (Math.round(d));
		System.out.println(a);
	}

}
