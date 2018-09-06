import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
public class ColorCode 
{

	public static void main(String[] args) 
	{
		String name;
		Scanner s=new Scanner(System.in);
		name=s.next();
		Pattern p=Pattern.compile("#[A-F_a-f_0-9]{6}");
		Matcher m=p.matcher(name);
		boolean b=m.matches();
		if(b==true)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
