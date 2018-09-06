import java.util.*;
import java.lang.*;
import java.io.*;
 
public class InnerPatten
{
	public static void main (String[] args)
	{
		InnerPatten o=new InnerPatten();
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(); 
		for(int i = 0; i < 2 * N - 1; i++) 
		{
			for(int j = 0; j < 2 * N - 1; j++) 
			{
				System.out.print(1+Math.max(Math.abs(N-i-1), Math.abs(N-j-1)) );
			}
			System.out.println();
		}
	}
 
}