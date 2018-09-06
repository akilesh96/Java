import java.util.Scanner;
public class SumofTwoPrimes2 {
static int checkPrime(int n){
	int i, isPrime = 1;

    for(i = 2; i <= n/2; ++i)
    {
        if(n % i == 0)
        {
            isPrime = 0;
            break;
        }  
    }

    return isPrime;
}

public static void main(String arg[])
{
int flag = 0,j=0;
int i;
Scanner s=new Scanner(System.in);
int t=s.nextInt();int n[]=new int[t];
for(i=0;i<t;i++)
n[i]=s.nextInt();
while(j!=t)
{
	if(checkPrime(n[j])==1)
		{System.out.println("no");j++;}
	else
		{
flag=0;
for(i = 2; i<= n[j]/2; ++i)
{
if (checkPrime(i) == 1)
{
if (checkPrime(n[j]-i) == 1)
{
System.out.println("yes");
flag = 1;
}
if(flag==1)
break;
}
}
if (flag == 0)
System.out.println("no");
j++;}
}
}
}