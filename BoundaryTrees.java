import java.util.Scanner;

public class BoundaryTrees {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt(),c=s.nextInt();
		int[][] num=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				num[i][j]=s.nextInt();
		int n=s.nextInt(),m=s.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==0 || j==0 || i==r-1 || j==c-1)
					System.out.print(num[i][j]+n*2*m+" ");
				else
					System.out.print(num[i][j]+n*m+" ");
			}
			System.out.println();
		}
	}

}
/*
4 3
5 3 6
9 4 10
7 8 7
8 9 9
1 3
*/