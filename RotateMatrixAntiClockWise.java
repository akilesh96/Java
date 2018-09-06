import java.util.*;
public class RotateMatrixAntiClockWise 
{
	
	static void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
	static void rightRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            rightRotatebyOne(arr, n);
    }
 
    static void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
    static void rightRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[n-1];
        for (i = n-1; i >= 1; i--)
            {arr[i] = arr[i - 1];}
        arr[i] = temp;
    }
    public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt(),c=r;String re=s.next();
		int mat[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		int count=0,cd=c,rd=r,cdfc=c+1,rdfc=r+1;
		//System.out.println(c/2);
		int rot[][];
		rot=new int[c/2][];
		while(count!=c/2)
		{
			rot[count]=new int[(cdfc-1)*2+((rdfc-1)*2)-4];
			//System.out.println(rot[count].length);
			int index=0;
			int i=count;
			for(int j=count;j<cd;j++)
				{rot[count][index]=mat[i][j];index++;}
			int j=cd-1;
			for(i=count+1;i<rd-1;i++)
			{
				rot[count][index]=mat[i][j];index++;
			}
			i=rd-1;
			for(j=cd-1;j>=count;j--)
			{
				rot[count][index]=mat[i][j];index++;
			}
			j=count;
			for(i=rd-2;i>count;i--)
			{
				rot[count][index]=mat[i][j];index++;
			}
			count++;
			rd--;cd--;rdfc-=2;cdfc-=2;
		}
		for(int i=0;i<count;i++)
		{
			if(re.equals("CCW"))
			leftRotate(rot[i], 1, rot[i].length);
			else if(re.equals("CW"))
				rightRotate(rot[i],1,rot[i].length);
		}
		cd=c;rd=r;
		int discount=0;
		while(discount!=c/2)
		{
		int index=0;
		int i=discount;
		for(int j=discount;j<cd;j++)
			{mat[i][j]=rot[discount][index];index++;}
		int j=cd-1;
		for(i=discount+1;i<rd-1;i++)
		{
			mat[i][j]=rot[discount][index];index++;
		}
		i=rd-1;
		for(j=cd-1;j>=discount;j--)
		{
			mat[i][j]=rot[discount][index];index++;
		}
		j=discount;
		for(i=rd-2;i>discount;i--)
		{
			mat[i][j]=rot[discount][index];index++;
		}
		discount++;
		rd--;cd--;
	}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			//System.out.println();
		}
	}
}
