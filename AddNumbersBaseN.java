import java.util.*;
public class AddNumbersBaseN {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),num[]=new int[2];
        num[0]=s.nextInt();num[1]=s.nextInt();
        int sum=0;
        for(int i=0;i<2;i++)
        {
            String str=Integer.toString(num[i]);
            int p=str.length()-1;
            for(int j=0;j<str.length();j++)
            {
            	int a=Character.getNumericValue(str.charAt(j));
            	sum+=a*((int)Math.pow(n, p));
            	p--;
            }
        }
        System.out.println(sum);
    }
}