import java.util.Scanner;
import java.util.Arrays;

public class ZeroSumTriplet {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String line;
		line=s.nextLine();
		String uline[]=line.split(" ");
		int n[]=new int[uline.length];
		for(int i=0;i<uline.length;i++)
		{
			n[i]=Integer.parseInt(uline[i]);
		}
		//Arrays.sort(n);
		for(int i=0;i<uline.length;i++)
		{
			for(int j=0;j<uline.length;j++)
			{
				if(n[i]<=n[j])
				{
					int t=n[i];
					n[i]=n[j];
					n[j]=t;
				}
			}
		}
		String b[]=new String[30];
		int c=0,f=0,ff=0;
		try{
		for(int i=0;i<uline.length;i++)
		{
			for(int j=i+1;j<uline.length;j++)
			{
				for(int k=j+1;k<uline.length;k++)
				{
					if(n[i]+n[j]+n[k]==0)
					{
						String a=(n[i]+" "+n[j]+" "+n[k]);
						b[c]=a;
						for(int l=0;l<c;c++)
						{
							if(a==b[l])
								f=1;
						}
						if(f!=1)
						{
							c++;
							System.out.println(a);
							ff=1;
						}
					}
				}
			}
		}}catch(Exception e){}
		if(ff==0)
		{
			System.out.println("None");
		}
	}

}
