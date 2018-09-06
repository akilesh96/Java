import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;
public class StrongPasswordCheck {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String pass=s.next();
		int f=0;
		if(pass.length()>=8 && pass.length()<=25)
		f=1;
		else
		f=0;
		int cf=0,nf=0;
		Pattern p1=Pattern.compile("[0-9]{1}");
		Pattern p2=Pattern.compile("[a-z]{1}");
		Pattern p3=Pattern.compile("[A-Z]{1}");
		Pattern p4=Pattern.compile("[#_!_$_@]{1}");
		int cc=0,sc=0;
		for(int i=0;i<pass.length();i++)
		{
		    char c1=pass.charAt(i);
		    if(c1=='_')
		    	cf++;
		    String c=Character.toString(c1);
		    Matcher m1=p1.matcher(c);
		    if(m1.matches())
		    nf++;
		    Matcher m2=p2.matcher(c);
		    if(m2.matches())
		    sc++;
		    Matcher m3=p3.matcher(c);
		    if(m3.matches())
		    cc++;
		    Matcher m4=p4.matcher(c);
		    if(m4.matches())
		    cf++;
		}
		if(f==1 && nf>=2 && sc>=1 && cc>=1 && cf>=1)
		{
		    System.out.println("VALID");
		}
		else
		{
		    System.out.println("INVALID");
		}

	}
}