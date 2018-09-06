import java.util.*;

public class Coll2 {

	public static void main(String[] args) 
	{
		HashSet a=new HashSet();
		a.add("Aki");
		a.add(25);
		a.add("Aki");
		a.add("amu");
		a.add("aki");
		a.add(2);
		ArrayList b=new ArrayList();
		b.add(5);
		b.add("Akilesh");
		a.addAll(b);
		b.addAll(a);
		System.out.println(b);
		
		

	}

}
