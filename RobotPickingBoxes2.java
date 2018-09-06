import java.util.Scanner;

public class RobotPickingBoxes2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),max=0;
		int[]num=new int[n];
		for(int i=0;i<n;i++){
			num[i]=s.nextInt();
			if(max<num[i])
				max=num[i];
		}
		int count=0,value=0;
		for(int i=0;i<n;i++){
			int c=num[i],ic=0;
			for(int j=0;j<n;j++){
				if(num[i]==num[j])
					ic++;
			}
			if(count<ic){
				count=ic;
				value=num[i];
			}
		}
		int[][]has=new int[max][n];
		
	}

}
