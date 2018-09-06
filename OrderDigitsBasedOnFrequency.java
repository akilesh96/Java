import java.util.Scanner;

public class OrderDigitsBasedOnFrequency {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			String check=Character.toString(str.charAt(i));
			if(!sb.toString().contains(check))
				sb.append(check);
		}
		char num[]=new char[sb.length()];int nlen[]=new int[sb.length()];
		for(int i=0;i<sb.length();i++)
			num[i]=((sb.charAt(i)));
		for(int i=0;i<num.length;i++)
		{
			char se=num[i];
			int c=0;
			for(int j=0;j<str.length();j++)
			{
				if(se==str.charAt(j))
					c++;
			}
			nlen[i]=c;
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{
				if(Character.getNumericValue(num[i])>Character.getNumericValue(num[j]))
				{
					char temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
			}
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{
				if(nlen[i]<nlen[j])
				{
					char temp=num[j];
					num[j]=num[i];
					num[i]=temp;
					int t=nlen[j];
					nlen[j]=nlen[i];
					nlen[i]=temp;
				}
			}
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<nlen[i];j++)
			{
				System.out.print(num[i]);
			}
		}
	}

}
