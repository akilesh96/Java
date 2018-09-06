import java.util.*;
public class PrintOnlyThreeDigitNumber {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int f=0;
		for(int i=0;i<str.length();i++)
		{
		    if(i==0)
		    {
		        char c=str.charAt(i),c1=str.charAt(i+1),c2=str.charAt(i+2),c3=str.charAt(i+3);
		        if(Character.isLetter(c3))
		        {
		            if(Character.isDigit(c) && Character.isDigit(c1) && Character.isDigit(c2))
		            {
		                System.out.print(c);
		                System.out.print(c1);
		                System.out.print(c2+" ");
		                f=1;
		            }
		        }
		    }
			if(i-1>=0 && i+3<str.length())
		    {
		        char l=str.charAt(i-1);
		        char c=str.charAt(i),c1=str.charAt(i+1),c2=str.charAt(i+2),c3=str.charAt(i+3);
		        if(Character.isLetter(l) && Character.isLetter(c3))
		        {
		            if(Character.isDigit(c) && Character.isDigit(c1) && Character.isDigit(c2))
		            {
		                System.out.print(c);
		                System.out.print(c1);
		                System.out.print(c2+" ");
		                f=1;
		            }
		        }
		    }
			if(i==str.length()-1)
		    {
		        char c=str.charAt(i-3),c1=str.charAt(i-2),c2=str.charAt(i-1),c3=str.charAt(i);
		        if(Character.isLetter(c))
		        {
		            if(Character.isDigit(c1) && Character.isDigit(c2) && Character.isDigit(c3))
		            {
		                System.out.print(c1);
		                System.out.print(c2);
		                System.out.print(c3+" ");
		                f=1;
		            }
		        }
		    }
		}
		if(f==0)
		System.out.print("-1");

	}
}