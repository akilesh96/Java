import java.util.*;

public class ZohoEncryption 
{

	public static void main(String[] args) 
	{
		String b;
		Scanner s=new Scanner(System.in);
		b=s.next();
		Set<String> a=decode("",b);
		System.out.println(a);
		System.out.print(a.size());
	}
	
	public static Set<String> decode(String prefix, String code) 
	{
		Set<String> set = new TreeSet<String>();
		if (code.length() == 0) 
		{
			set.add(prefix);
			return set;
		}
		
		if (code.charAt(0) == '0')
			return set;
		
		set.addAll(decode(prefix + (char) (code.charAt(0) - '1' + 'a'),code.substring(1)));
		if (code.length() >= 2 && code.charAt(0) == '1') 
		{
			set.addAll(decode(prefix + (char) (10 + code.charAt(1) - '1' + 'a'),code.substring(2)));
		}
		if (code.length() >= 2 && code.charAt(0) == '2'&& code.charAt(1) <= '6') 
		{
			set.addAll(decode(prefix + (char) (20 + code.charAt(1) - '1' + 'a'),code.substring(2)));
		}
		return set;
	}
}