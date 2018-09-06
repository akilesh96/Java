import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SnakeSequence 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine(),sp[]=str.split("\\s+");
		int len=sp.length,arr[]=new int[len],seqlen=0;int fdis[]=new int[len],f=0;
		String seq="#";
		for(int i=len-1;i>=0;i--)
			arr[i]=Integer.parseInt(sp[i]);
		for(int i=0;i<len;i++)
			fdis[i]=Integer.parseInt(sp[i]);
		for(int i=0;i<len;i++)
		{
			int dis[]=new int[len];
			int index=0;
			//StringBuilder sb=new StringBuilder();
			int nxt=arr[i];
			dis[index]=nxt;
			index++;
			String d[]=new String[len];
			for(int j=len-1;j>=0;j--)
				d[j]=Integer.toString(arr[j]);
			for(int k=0;k<len;k++){
			for(int j=0;j<len;j++)
			{
				if(d[j]=="#")
					continue;
				else if(i==j)
					continue;
				else if(nxt+1==Integer.parseInt(d[j]))
				{
					nxt=Integer.parseInt(d[j]);
					d[j]="#";
					dis[index]=nxt;index++;
				}
				else if(nxt-1==Integer.parseInt(d[j]))
				{
					nxt=Integer.parseInt(d[j]);
					d[j]="#";
					dis[index]=nxt;index++;
				}	
			}}
			if(seqlen<=index)
			{
				seqlen=index;
				if(f!=1)
				for(int j=0;j<index;j++)
					fdis[j]=dis[j];
			}
		}
		for(int i=0;i<seqlen;i++)
			System.out.print(fdis[i]+" ");
	}
}
//5 6 7 9 8 8
//-5 -4 -3 -1 0 1 4 6 5 4 3 4 3 2 1 0 2 -3 9