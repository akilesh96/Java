import java.util.Scanner;

public class PrintNthNumberforTwoDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int d1=s.nextInt(),d2=s.nextInt(),n=s.nextInt();
		int f=0,i=9;
		while(f!=n)
		{
			String c=Integer.toString(i);
			int l=c.length();
			int inf=0,d1f=0,d2f=0;
			for(int j=0;j<l;j++)
			{
				if(Character.getNumericValue(c.charAt(j))==d1)
				{
					inf++;
					d1f=1;
				}
				else if(Character.getNumericValue(c.charAt(j))==d2)
				{
					inf++;
					d2f=1;
				}
				else
					break;
				if(inf==l && d1f==1 && d2f==1)
					{f++;}
			}
			i++;
		}
		System.out.println(i-1);

	}

}
