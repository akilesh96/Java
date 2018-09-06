import java.util.Scanner;

public class Example1 
{

	public static void main(String a[]) 
	{int d,b;
	System.out.print("Enter starting no.:\n");
	Scanner ab=new Scanner(System.in);
	d=ab.nextInt();
	System.out.print("Enter last no.:\n");
	b=ab.nextInt();
	for(int i=d;i<=b;i++)
	{
	if((i%2!=0)&&(i%3!=0))
	{
		System.out.print(i+"\t");
	}
	

	}

}}
