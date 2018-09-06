import java.util.*;

public class SubStringIndex2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next(),s2=s.next();
		if(s1.contains(s2))
			System.out.println(s1.indexOf(s2));
		else
			System.out.println("-1");
	}

}
