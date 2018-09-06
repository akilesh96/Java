import java.util.*;
public class TopRankingStudent 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),max=0;
        String full[]=new String[n];
        for(int i=0;i<n;i++)
        {
            String name=s.next();
            int test=s.nextInt(),ido=s.nextInt();
            int t20=s.nextInt();
            int tot=test+ido+t20;
            full[i]=name+" "+tot+" "+test+" "+ido+" "+t20;
            if(max<tot)
            max=tot;
        }
        int max1=0;
        for(int i=0;i<n;i++)
        {
            String sp[]=full[i].split("\\s+");
            if(Integer.parseInt(sp[1])==max)
            {
                int c=Integer.parseInt(sp[2]);
                if(max1<c)
                max1=c;
            }
            else
            full[i]="0";
        }
        max=0;
        for(int i=0;i<n;i++)
        {
            if(full[i]=="0")
            continue;
            String sp[]=full[i].split("\\s+");
            if(Integer.parseInt(sp[2])==max1)
            {
                int c=Integer.parseInt(sp[3]);
                if(max<c)
                max=c;
            }
            else
            full[i]="0";
        }
        max1=0;
        for(int i=0;i<n;i++)
        {
            if(full[i]=="0")
            continue;
            String sp[]=full[i].split("\\s+");
            if(Integer.parseInt(sp[3])==max)
            {
                    int c=Integer.parseInt(sp[2]);
                    if(max1<c)
                    max1=c;
            }
            else
                full[i]="0";
        }
        for(String i:full)
        {
            if(i=="0")
            continue;
            String sp[]=i.split("\\s+");
            System.out.println(sp[0]);
        }
    }
}