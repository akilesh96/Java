import java.util.*;
public class hel
{
public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int l=s.length();
        int sum=0;
        for(int i=0;i<l;i++)
        {
            char a=s.charAt(i);
            if(a=='1' || a=='2'|| a=='3' || a=='4' || a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0')
            {
                if(i<l)
            	i++;
                char b=s.charAt(i);
                if(b=='1'||b=='2'||b=='3'||b=='4'||b=='5'||b=='6'||b=='7'||b=='8'||b=='9'||b=='0')
                {
                    if(i<l)
                	i++;
                    char c=s.charAt(i);
                    if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
                    {
                        if(i<l)
                    	i++;
                        char d=s.charAt(i);
                        if(d!='0'||d!='1'||d!='2'||d!='3'||d!='4'||d!='5'||d!='6'||d!='7'||d!='8'||d!='9')
                        {
                        int temp=Character.getNumericValue(a);
                        temp*=10;
                        temp+=Character.getNumericValue(b);
                        temp*=10;
                        temp+=Character.getNumericValue(c);
                        sum+=temp;
                        }
                    }
                }
            }
        }
        System.out.print(sum);
	}
}