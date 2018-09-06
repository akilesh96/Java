import java.util.Scanner;

public class PrintGrandFatherName {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String name[]=new String[3];
		for(int i=0;i<3;i++)
			name[i]=s.nextLine();
		for(int i=0;i<3;i++)
		{
			String sp[]=name[i].split("\\s+");
			int f=0;
			for(int j=0;j<3;j++)
			{
				if(i==j)
					continue;
				if(name[j].contains(sp[1]))
					f++;
			}
			if(f==0)
				System.out.println(name[i]);
		}
	}

}
