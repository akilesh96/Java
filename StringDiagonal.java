import java.util.Scanner;

public class StringDiagonal {

	public static void main(String[] args) 
	{
		String a;
		Scanner s=new Scanner(System.in);
		a=s.next();
		int i,j;
		int c=a.length()-1;
		for(i=0;i<a.length();i++)
		{	
			for(j=0;j<a.length();j++)
			   {   
				if(i==j)
				System.out.print(a.charAt(i));
				else if(j==c)
				System.out.print(a.charAt(c));
			    else
				System.out.print(" ");
			    }
			c--;
			System.out.println();
		
			
		}
	}

}
