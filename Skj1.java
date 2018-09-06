import java.util.Scanner;

public class Skj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String sp[]=str.split(":");
		int h=Integer.parseInt(sp[0]);
		int m=Integer.parseInt(sp[1]);
		if(h<24&&m<=60)
		{
		    if(h<12)
		    System.out.println("AM");
		    if(h==12&&m<=60)
		    System.out.println("PM");
		    else
		    System.out.println("PM");
		}
		else
		System.out.println("INVALIDINPUT");
	}

}
