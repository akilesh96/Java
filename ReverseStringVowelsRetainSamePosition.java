import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;
public class ReverseStringVowelsRetainSamePosition 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		Pattern p=Pattern.compile("[a_e_i_o_u_A_E_I_O_U]");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			Matcher m1=p.matcher(Character.toString(str.charAt(i)));
			if(!m1.matches())
				sb.append(str.charAt(i));
		}
		sb.reverse();
		for(int i=0,j=0;i<str.length();i++)
		{
			Matcher m=p.matcher(Character.toString(str.charAt(i)));
			if(m.matches())
			{
				System.out.print(str.charAt(i));
				continue;
			}
			System.out.print(sb.charAt(j));
			j++;
		}
	}
}
//AkUDDSuashlkjkKLJALSJKLASLJAKLSJLAUQWQYTKooooLKJDDSIOHUIN