import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class InsectWar {

	public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),count=0;
		while(count!=n)
		{
			int n1=s.nextInt(),n2=s.nextInt();
			int t=s.nextInt(),incount=0;
			HashSet<Integer> h=new HashSet();
			h.add(n1);
			h.add(n2);
			while(incount!=t)
			{
				HashSet<Integer> h1=new HashSet(),copy=new HashSet();
				copy=(HashSet)h.clone();
				Iterator<Integer> itr=h.iterator();
				while(itr.hasNext())
				{
					int num=itr.next();
					//int num=nu;
					for(int j:copy)
						if(num>j)
							h1.add(num+j);
					int m=Collections.max(h);
					for(int j:copy)
						if(m>j)
							h1.add(j+j+m);
				}
				for(int j:h1)
					h.add(j);
				System.out.println(h);
				//h.add(h1);
				incount++;
			}
			System.out.println(Collections.max(h));
			count++;
		}
	}

}
