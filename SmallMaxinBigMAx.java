import java.util.Scanner;

public class SmallMaxinBigMAx {

	public static void main(String[] args) 
	{
		int ml,nl;
		Scanner s=new Scanner(System.in);
		ml=s.nextInt();
		nl=s.nextInt();
		int m[][]=new int[ml][ml];
		int n[][]=new int[nl][nl];
		for(int i=0;i<ml;i++)
			for(int j=0;j<ml;j++)
			{
				m[i][j]=s.nextInt();
			}
		for(int i=0;i<nl;i++)
			for(int j=0;j<nl;j++)
			{
				n[i][j]=s.nextInt();
			}
		int rf=0,f=0,found=0;
		for(int i=0;i<ml;i++)
			for(int j=0;j<ml;j++)
			{
				f=0;
				for(int ni=0;ni<nl;ni++)
				{
					rf=0;
					for(int nj=0;nj<nl;nj++)
					{
						if((i+ni<ml)&&(j+nj<ml))
						{
						if(m[i+ni][j+nj]==n[ni][nj])
							rf++;
						else
							break;
						}
					}
					if(rf==nl)
						f++;
					if(f==nl)
						found=1;
						
				}
				if(found==1)
					break;
			}
		if(found==1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
