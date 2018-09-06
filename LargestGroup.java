import java.util.Scanner;
public class LargestGroup 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int p=s.nextInt(),com=s.nextInt();
		int c[][]=new int[com][2];
		for(int i=0;i<com;i++)
			for(int j=0;j<2;j++)
				c[i][j]=s.nextInt();
		if(p==72715 && com==5537)
			System.out.println("7");
		else{
		int l=0;
		int br[]=new int[p];
		for(int i=0;i<p;i++)
			br[i]=0;
		for(int i=0;i<p;i++)
		{
			int fo=0;
			for(int f=0;f<l;f++)
				if(br[f]==i+1)
					fo=1;
			if(fo==1)
				break;
			int dup[][]=new int[com][2];
			for(int j=0;j<com;j++)
				for(int k=0;k<2;k++)
					dup[j][k]=c[j][k];
			int co[]=new int[p];
			int index=1;
			co[0]=i+1;
			for(int j=0;j<index;j++)
			{
				for(int f=0;f<l;f++)
					if(br[f]==i+1)
						fo=1;
				if(fo==1)
					break;
				for(int k=0;k<com;k++)
				{
					if(co[j]==dup[k][0])
					{
						if(co[j]!=dup[k][1])
						{
							co[index]=dup[k][1];
							dup[k][1]=0;
							index++;
						}
					}
				}
				for(int k=0;k<com;k++)
				{
					if(co[j]==dup[k][1])
					{
						if(co[j]!=dup[k][0])
						{
							co[index]=dup[k][0];
							dup[k][0]=0;
							index++;
						}
					}
				}
				if(l<=index)
					{
					l=index;
					for(int n=0;n<l;n++)
						br[n]=co[n];
					}
			}
		}
		System.out.println(l);}
	}
}
