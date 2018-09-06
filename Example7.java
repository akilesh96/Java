import java.util.*;
public class Example7 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        for(int i=0;i<str.length();i++)
        {
            int f=1;
            while(Character.isLetter(str.charAt(i+1)))
            {
            	i++;
            	f++;
            }
            if(i+1<str.length())
            	i++;
            while(f!=0)
            {
            int count=0;
            while(count!=(Character.getNumericValue((str.charAt(i)))))
            {
            	System.out.print(str.charAt(i-f));
            	count++;
            }
            f--;
            }
        }
	}
}