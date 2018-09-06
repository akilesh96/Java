
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
//Example for HashSet and Sorting them using ArrayList
public class MergeSortedArrays {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine(),s2=s.nextLine();
		String sp1[]=s1.split("\\s+");
		String sp2[]=s2.split("\\s+");
		HashSet<Integer> set=new HashSet();
		for(int i=0;i<sp1.length;i++)
			set.add(Integer.parseInt(sp1[i]));
		for(int i=0;i<sp2.length;i++)
			set.add(Integer.parseInt(sp2[i]));
		ArrayList<Integer> fout=new ArrayList<Integer>(set);
		Collections.sort(fout);
		Iterator itr=fout.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}

}