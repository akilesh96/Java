import java.util.Scanner;
public class ThreeStrings {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[]str=new String[n];
		String s1="",s2="",s3="";
		for(int i=0;i<str.length;i++){
			str[i]=s.next();
			s1+=str[i].substring(0,i+1);
			s2+=str[i].substring(i+1,str[i].length()-(i+1));
			s3+=str[i].substring(str[i].length()-(i+1), str[i].length());
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}
/*
4
JOHN
JOHNY
JANARDHAN
MIKESPENCER
*/