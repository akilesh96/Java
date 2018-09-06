import java.util.Scanner;
public class SimpleCalculatorCommand 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int a=0,b=0;char operation='a';
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isLetter(ch))
				{
				sb.append(" ");
				operation=Character.toLowerCase(ch);
				}
			else
				sb.append(ch);
		}
		str=sb.toString();
		String sp[]=str.split("\\s+");
		b=Integer.parseInt(sp[1]);
		a=Integer.parseInt(sp[0]);
		if(operation=='a')
			System.out.println(a+b);
		else if(operation=='s')
			System.out.println(a-b);
		else if(operation=='m')
			System.out.println(a*b);
		else
			System.out.println(a/b);
	}
}