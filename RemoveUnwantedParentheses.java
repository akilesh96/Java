import java.util.Scanner;
public class RemoveUnwantedParentheses 
{public static void main(String[] args){
		Scanner S=new Scanner(System.in);
		String s=S.next();
		int l=s.length(),f=0,c=0,ct=0;
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)=='(')
			{
				ct++;
				f=1;
				c=ct;
			}
			else if(s.charAt(i)==')' && f==1)
			{
				ct--;
			}
			if(ct==0 && f==1)
				break;
		}
		c=c-ct;
		f=0;int fct=0,bct=0;
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			if(ch=='(' && fct+1<=c)
			{
				f=1;
				fct++;
				System.out.print("(");
			}
			else if(ch==')' && f==1 && bct+1<=c)
			{
				bct++;
				System.out.print(")");
			}
			else if(Character.isAlphabetic(ch)||Character.isDigit(ch))
				System.out.print(s.charAt(i));
		}
	}

}
