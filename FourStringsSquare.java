import java.util.*;
public class FourStringsSquare {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]str=new String[4];
		for(int i=0;i<4;i++)
		str[i]=s.next();
		int len=str[0].length();
		//System.out.println(len);
		char[][] mat=new char[len][len];
		for(int j=0;j<len;j++)
		mat[0][j]=str[0].charAt(j);
		for(int i=1;i<len;i++)
		for(int j=0;j<len;j++)
		mat[i][j]='*';
		int counter=0;
		char last=str[0].charAt(len-1); 
		while(counter!=3){
		    //char last=str[counter].charAt(len-1);
		    String sstr=null;
		    int f=0;
		    for(int i=0;i<4;i++)
		    {
		        if(last==str[i].charAt(0)){
		        sstr=str[i];
		        last=str[i].charAt(len-1);
		            f=1;
		            break;
		        }
		    }
		    //System.out.println(sstr);
		    if(counter==0&&f==1){
		        for(int i=1;i<len;i++)
		        mat[i][len-1]=sstr.charAt(i);
		    }
		    if(counter==1&&f==1){
		        for(int i=len-2,j=1;i>=1;i--,j++){
		        mat[len-1][i]=sstr.charAt(j);
		        }
		    }
		    if(counter==2&&f==1){
		        for(int i=len-1,j=0;i>=0;i--,j++)
		        mat[i][0]=sstr.charAt(j);
		    }
		    counter++;
		}
		//display
		for(int i=0;i<len;i++){
		for(int j=0;j<len;j++){
		System.out.print(mat[i][j]);}
		System.out.println();
		}
		//System.out.println("Hi");
	}
}