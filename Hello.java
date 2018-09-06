import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Hello 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        sc.nextLine();
        HashSet<String> hs = new HashSet<>();   
        String invitation = "";
        for(int i =0; i < N; i++)
        {
            String str = sc.nextLine();
            String friend = "";
            int j =0;
            while(str.charAt(j)!= ' ')  
            {
                friend = friend + str.charAt(j++);
                hs.add(friend);
            }
            j= j+2;
            invitation=invitation+str.substring(j)+" "; 
        }        
        int j =0;
        StringTokenizer st = new StringTokenizer(invitation); 
        while(st.hasMoreTokens())
        {
            String str = st.nextToken();
            if(!hs.contains(str))   {
                         System.out.print(str+" ");
	}

}}}
