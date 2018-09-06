import java.util.ArrayList;
import java.util.Iterator;



public class ArrLst {
	public static void main(String a[])
	{
		int j=10;
		ArrayList al=new ArrayList();
		al.add(24);
		al.add(j);
		al.add("Akilesh");
		al.add(24.5);
		System.out.println(al);
		ArrayList a2=new ArrayList();
		a2.add(2);
		a2.add(25);
		a2.add("Jamunath");
		Iterator b=a2.iterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
		al.addAll(a2);
		al.retainAll(a2);
		System.out.println(al);
		System.out.println(a2);
		for(Object i:al)
		{
			System.out.println(i);
		}
	}

}
