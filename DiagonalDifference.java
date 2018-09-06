import java.util.*;
public class DiagonalDifference {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=0,n2=0,track=n-1,f=0,t=0;
		for(int i=0;i<n;i++){
		for(int j=0;j<n;j++)
		{
		    int input=s.nextInt();
			if(i==j)
		    n1+=input;
		    if(j==track&&t==i)
		    n2+=input;
		    //System.out.println(n1+" "+n2);
		}
		track--;
		t++;
		}
		System.out.println(Math.abs(n2-n1));


	}
}
/*
5
2 7 3 6 8
6 9 9 10 8
8 7 7 7 5
9 10 5 3 2
1 2 3 4 6
*/