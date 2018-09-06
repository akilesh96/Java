import java.util.Scanner;

public class StudentsAndDepartment {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] name=new String[n],dep=new String[n];
		for(int i=0;i<n;i++)
		{
			name[i]=s.next();
			dep[i]=s.next();
		}
		String d=s.next();
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<dep[i].length();j++)
			{
				if(d.length()>j)
					if(dep[i].charAt(j)==d.charAt(j))
						c++;
			}
			if(c==d.length())
				System.out.println(name[i]);
		}
	}

}
/*
5
ARUN CSE
BHUVANA ECE
GANESH MECH
PAV ECE
ROHIT CSE
ECE
*/