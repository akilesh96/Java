import java.util.Scanner;

public class NonRepeatingNumberPosition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=2*s.nextInt()+1;
		String str[]=new String[n];
		for(int i=0;i<n;i++)
			str[i]=s.next();
		int i=0;
		for(;i<n;i++)
		{
			if(str[i]=="#")
				continue;
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(str[j]=="#" || i==j)
					continue;
				if(str[i].equals(str[j]))
				{
					c++;
					str[i]=str[j]="#";
					break;
				}
			}
			if(c==0)
				break;
		}
		System.out.println(i+1);
	}

}
