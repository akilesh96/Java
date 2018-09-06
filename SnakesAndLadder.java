import java.util.*;
public class SnakesAndLadder {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt(),c=s.nextInt();
		char[][]mat=new char[r][c];
		for(int i=0;i<r;i++)
		for(int j=0;j<c;j++)
		mat[i][j]=s.next().charAt(0);
		int posi=r-1,posj=0,i=0,f=0;
		StringBuilder sb=new StringBuilder("");
		try{
		while(true){
		    int die=s.nextInt();
		    System.out.println(die);
		    sb.append(die);
		    sb.append(" ");
		    while(die!=0){
		        if(posi%2==1){
		            posj++;
		            if(posj==c){
		            posj--;
		            posi--;
		            }
		        }
		        else if(posi%2==0){
		            posj--;
		            if(posj==-1){
		            posj++;
		            posi--;
		            }
		        }
		        die--;
		    }
		    System.out.println(posi+" "+posj);
		    System.out.println("--------------");
		    while(mat[posi][posj]!='*'){
		        if(posi==0)
		        break;
		        if(mat[posi][posj]=='S'){
		            posi++;
		            if(posi==r)
		            	posi--;
		        }
		        else if(mat[posi][posj]=='L'){
		            posi--;
		            if(posi==-1)
		            	posi=0;
		        }
		    }
		    if(posi==0&&posj==0)
		    f=1;
		    else if(posi<0)
		    f=1;
		    if(f==1)
		    break;
		}
		}
		catch(NoSuchElementException e){}
		if(f==1){
		    System.out.print(sb.toString());
		}
		else
		System.out.println("-1");
	}
}
/*
6 6
* S * * * *
* * L S * *
* * * * * *
* * * * L *
* * S * * *
* * * L * *
4 1 1 3 5 4 2 3 6 1 4 2 1 5 3 6
4 4
* * * L
* * S *
* S * L
* * S *
2 3 1 1 4 4 5 6 5 6 2 3 1 5 5
*/