
public class stack 
{	
	static int arr[]=new int[10];
	static int top=0;
	static void push(int n)
	{
		//System.out.println("came");
		if(top>10)
			System.out.println("Over flow");
		else
		{
			arr[top++]=n;
			//System.out.println(n);
		}
		
	}
	static void pop()
	{
		if(top==-1)
			System.out.println("Underflow");
		else
		{
			System.out.println(arr[--top]);
		}
	}
	static void display()
	{
		int i=0;
		while(top-1!=i)
		{
			System.out.print(arr[i]+" ");
			i++;
		}
	}
	public static void main(String[] args) 
	{
		push(20);
		push(10);
		push(12);
		display();
		pop();
		display();
		pop();
		display();
		push(30);
		int a=1;
switch(a)
{
case 1:
	System.out.println("hi");
}
		
	}

}
