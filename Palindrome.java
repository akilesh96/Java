import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuilder sb=new StringBuilder(str);
		if(sb.reverse().toString().equals(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}