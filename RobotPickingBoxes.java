import java.util.Scanner;

public class RobotPickingBoxes {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]num=new int[n];
		for(int i=0;i<n;i++){
			num[i]=s.nextInt();
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
		int horCount=0;
		for(int i=0;i<value;i++){
			horCount++;
			int greaterOne=0;
			for(int j=0;j<n;j++){
				if(num[j]==0){
					if(j+1<n){
						if(num[j+1]==0)
							continue;
					}
					else if(j+1==n-1){
						if(num[n-1]==0)
							continue;
					}
					else if(j==n-1 && num[j]==0)
						continue;
					horCount++;
					continue;
				}
				num[j]--;
				if(num[j]>0)
					greaterOne++;
			}
			if(i==value-1)
				horCount+=greaterOne;
		}
		if(n<horCount)
			System.out.println(n);
		else
			System.out.println(horCount);
	}
}
