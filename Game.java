import java.util.*;
public class Game {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		str[i]=s.next();
		int c=s.nextInt();
		String start=s.next(),display=start;
		char l=start.charAt(start.length()-1);
		int count=1;
		while(count!=c)
		{
		    count++;
		    for(int i=0;i<n;i++)
		    {
		        if(l==str[i].charAt(0))
		        {
		            l=str[i].charAt(str[i].length()-1);
		            display=str[i];
		            break;
		        }
		    }
		}
		System.out.println(display);

	}
}