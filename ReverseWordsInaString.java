import java.util.*;
public class ReverseWordsInaString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String sen=s.nextLine();
		String sp[]=sen.split("\\s");
		int len=sp.length-1;
		while(len!=-1)
		{
			System.out.print(sp[len]+" ");
			len--;
		}
	}

}
