import java.util.Scanner;

public class zohoProgram1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt(),c=s.nextInt();
		int[][]num=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				num[i][j]=s.nextInt();
			}
		}
		int pos1=s.nextInt(),pos2=s.nextInt();
		int dir=0;
		if(pos1>r/2){
			dir=0;
		}
		else{
			dir=1;
		}
		for(int j=pos2,count=0;j<c;j++,count++){
			if(dir==1){
				for(int i=pos1;i<r;i++){
					System.out.print(num[i][j]);
				}
				dir=0;
				System.out.println();
			}
			else if(dir==0){
				for(int i=pos1;i<r;i++){
					System.out.print(num[i][j]);
				}
				dir=1;
				System.out.println();
			}
		}
	}

}
