import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=s.next();
		int c=(int) Math.ceil((float)str.length()/n);
		int count=0,f=0;
		char[][]st=new char[n][c];
		for(int j=0;j<c;j++){
			if(j%2==0)
			for(int i=0;i<n;i++){
				st[i][j]=str.charAt(count);
				count++;
				if(count==str.length()){
					f=1;
					break;
				}
			}
			if(f==1)
				break;
			else
				for(int i=n-1;i>=0;i--){
					st[i][j]=str.charAt(count);
					count++;
					if(count==str.length()){
						f=1;
						break;
					}
				}
			if(f==1)
				break;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<c;j++)
				System.out.print(st[i][j]);
			System.out.println();
		}
	}

}
/*
5
stmcskaheinasmiln
*/