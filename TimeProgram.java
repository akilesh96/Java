import java.util.Scanner;
public class TimeProgram {
public static void main(String arr[])
{
Scanner s=new Scanner(System.in);
int m,n;
m=s.nextInt();
n=s.nextInt();
String ct;
ct=s.next();
int cth,ctm;
String ctt[]=ct.split(":");
cth=Integer.parseInt(ctt[0]);
ctm=Integer.parseInt(ctt[1]);
int c[]=new int[m];
int f[]=new int[m];
for(int i=0;i<m;i++)
{
	String a;
	a=s.next();
	String d[]=a.split(":");
	c[i]=Integer.parseInt(d[0]);
	f[i]=Integer.parseInt(d[1]);
}
int count=0;
for(int i=0;i<m;i++)
{
	if(cth==c[i])
		if(ctm==f[i])
			count++;
		else if(ctm>f[i])
			count++;
	if(cth>c[i])
		count++;
}
if(count>=n)
{
	System.out.println("No");
}
else
{
	System.out.println("Yes");
}
}
}