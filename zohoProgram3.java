import java.util.Scanner;

public class zohoProgram3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt(),c=s.nextInt();
		int[][]num=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				num[i][j]=s.nextInt();
			}
		}
		int fav=s.nextInt();
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(i==j)
					continue;
				int temp=num[i][j];
				if(j+1<c){
					temp+=num[i][j+1];
					if((num[i][j]+num[i][j+1])==fav)
						System.out.println(num[i][j]+"+"+num[i][j+1]+":"+temp);
				}
				if(i+1<r){
					temp+=num[i+1][j];
					if((num[i][j]+num[i+1][j])==fav)
						System.out.println(num[i][j]+"+"+num[i+1][j]+":"+temp);
				}
			}
		}
	}

}
