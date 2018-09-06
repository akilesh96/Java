import java.util.*;

public class AlternateSortingofNumbers {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String in=s.nextLine();
		String sp[]=in.split("\\s");
		int len=sp.length,n[]=new int[len];
		for(int i=0;i<len;i++)
			n[i]=Integer.parseInt(sp[i]);
		Arrays.sort(n);
		int blen=len-1;
		for(int i=0;i<len;i++)
		{
			System.out.print(n[blen]+" ");
			blen--;
			if(blen<len/2)
			{
				blen=i;
				break;
			}
			System.out.print(n[i]+" ");
		}
		if(len%2==0)
			System.out.print(n[blen]);
	}

}
