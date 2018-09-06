import java.util.*;
public class SubStringIndex {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next(),s2=s.next();
		int len1=s1.length(),len2=s2.length(),f=0,index=0;
		for(int i=0;i<len1;i++)
		{
			f=0;index=i;
			for(int j=0;j<len2;j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					if(i<len1)
						i++;
					f++;
				}
			}
			if(f==len2)
				break;
		}
		if(f!=0)
		System.out.println(index);
		else
			System.out.println("-1");
	}

}
