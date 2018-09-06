import java.util.Scanner;

public class NonRepeatingNumberPosition2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String str=s.nextLine();
		StringBuilder sb=new StringBuilder(" "+str+" ");
		String sp[]=str.split("\\s+");
		int i=0;
		for(;i<sp.length;i++)
			{
			int in=sb.indexOf((" "+sp[i]));
			sb.delete(in,in+sp[i].length()+1);
			String check=sb.toString();
			if(!check.contains(" "+sp[i]+" "))
				break;
			sb.delete(0,sb.length());
			sb.append(" "+str+" ");
			}
		System.out.println(i+1);

	}

}
