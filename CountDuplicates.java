import java.util.Scanner;
import java.util.TreeSet;

public class CountDuplicates {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),num[]=new int[n];
		TreeSet<Integer> has=new TreeSet<Integer>();
		for(int i=0;i<n;i++)
		{
			num[i]=s.nextInt();
			has.add(num[i]);
		}
		int count=0;
		for(int i:has)
		{
			int c=0;
			for(int j=0;j<n;j++)
				if(i==num[j])
					c++;
			if(c>1)
				count++;
		}
		System.out.println(count);
	}

}
