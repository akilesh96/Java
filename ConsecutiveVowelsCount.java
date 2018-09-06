import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ConsecutiveVowelsCount 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int c=0;
		Pattern p=Pattern.compile("[a_e_i_o_u]");
		for(int i=0;i<str.length();i++)
		{
			Matcher m=p.matcher(Character.toString(str.charAt(i)));
			if(m.matches())
			{
				if(i+1<str.length())
				{
				Matcher m1=p.matcher(Character.toString(str.charAt(i+1)));
				if(m1.matches())
				c++;
				}
			}
		}
		System.out.println(c);
	}
}
