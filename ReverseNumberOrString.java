import java.util.Scanner;

public class ReverseNumberOrString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}

}
