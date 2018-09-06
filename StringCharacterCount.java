import java.util.Scanner;

public class StringCharacterCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			String check=sb.toString();
			String tc=Character.toString(str.charAt(i));
			if(!check.contains(tc))
			sb.append(tc);
		}
		for(int i=0;i<sb.length();i++)
		{
			int c=0;
			for(int j=0;j<str.length();j++)
			{
				if(sb.charAt(i)==str.charAt(j))
					c++;
			}
			System.out.println(sb.charAt(i)+""+c);
		}
	}

}
