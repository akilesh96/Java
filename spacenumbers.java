

import java.util.Scanner;

public class spacenumbers {

public static void main(String arr[])

{

Scanner s=new Scanner(System.in);

String a;

a=s.nextLine();

String b[]=a.split(" ");


int c[]=new int[b.length];
int f[]=new int[b.length];


for(int i=0;i<b.length;i++)

{
	String d[]=b[i].split(":");
	c[i]=Integer.parseInt(d[0]);
	f[i]=Integer.parseInt(d[1]);
	//System.out.println(c[i]+" "+c[i]);
}

for(int i=0;i<c.length;i++)

{

System.out.println(c[i]+" "+f[i]);

}

}

}