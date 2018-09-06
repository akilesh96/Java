import java.util.*;
public class MissingNumberinSequence 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int len=str.length();
		for(int i=1;i<=len;i++)
		{
			int f=0,num=0;
			for(int j=0;j<=len;j++)
			{
				if(j+i+i<=len)
				{
					String sub1=str.substring(j,j+i),sub2=str.substring(j+i,j+i+i);
					int num1=Integer.parseInt(sub1),num2=Integer.parseInt(sub2);
					if(num1-1==num2)
					{
						f++;
					}
					else if(num1-2==num2)
					{
						num=num1-1;
						f++;
					}
				}
			}
			if(f==len/i-1)
			{
				if(num==0)
				{
					String sub=str.substring(len-i);
					num=Integer.parseInt(sub);int p=0;
					while(p!=1)
					{
						num++;
						sub=Integer.toString(num);
						if(str.contains(sub)==false)
						{
							p=1;
						}
					}
				}
				System.out.println(num);
				break;
			}
		}
	}
}
//1000998997996995