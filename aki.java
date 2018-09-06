import java.util.Scanner;

public class aki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        int c;
        int su=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        c=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(n+" "+c);
        int max=0;
        for(int i=0;i<n;i++)
        {
            int ci=1;
        	su=a[i];
            for(int j=0;j<n;j++)
            {
            	if(i==j)
            		continue;
            	for(int k=1;k<c;k++)
            	{
            		if(j+k<n)
            		su+=a[j+k];
            		System.out.println(su);
            	}
            	if(max<su)
                    max=su;
            }
            
        }
        System.out.println(max);

	}

}
