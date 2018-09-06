import java.util.HashSet;
import java.util.Scanner;

public class RelativeMeeting {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt(),a[]=new int[n],b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            b[i]=s.nextInt();
        }
        int f=s.nextInt();
        int index=1,arr[]=new int[n*2],g=0;
        for(int i=0;i<n;i++)
        {
            if(f==a[i]||f==b[i])
            {
                g=1;
                break;
            }
        }
        arr[0]=f;
        HashSet h=new HashSet();
        h.add(f);
        for(int i=0;i<index;i++)
        {
            int check=arr[i];
            for(int j=0;j<n;j++)
            {
                if(check==a[j]&&a[j]>0)
                {
                    arr[index++]=b[j];
                    h.add(b[j]);
                    a[j]=-1;
                    b[j]=-1;
                }
                if(check==b[j]&&b[j]>0)
                {
                    arr[index++]=a[j];
                    h.add(a[j]);
                    a[j]=-1;
                    b[j]=-1;
                }
            }
        }
        if(g==1)
        System.out.println(h.size());
        else
        System.out.println("0");
	}
}
/*
5
10 20
30 20
40 10
55 35
55 22
40
*/