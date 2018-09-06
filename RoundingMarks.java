import java.util.Scanner;
public class RoundingMarks
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0)
		{
			int num=s.nextInt();
			if(num<=37)
				System.out.println(num);
			else if(5-(num%5)<3)
				System.out.println(num+5-(num%5));
			else
				System.out.println(num);
		}
	}
}
/*
4
83
57
48
33
*/