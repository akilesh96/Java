import java.util.ArrayList;
import java.util.Scanner;

public class MaxPowerPointsEmperorCapturingCountries {
	static int p=0,pp=0;
	public static void Permute(int[] input, int startindex,ArrayList<Object> a) {
        int size = input.length;
        ArrayList b=new ArrayList(a);
        if (size == startindex + 1) {
            for (int i = 0; i < size; i++) {
            	int inp=input[i];
    			if(b.size()!=1)
    			for(int j=0;j<b.size();j++)
    			{
    				if((int)b.get(j)==input[i])
    				{
    					if(j+1<b.size())
    						inp*=(int)b.get(j+1);
    					if(j-1>=0)
    						inp*=(int)b.get(j-1);
    					b.remove(b.get(j));
    					break;
    				}
    			}
    			p+=inp;
    			if(pp<p){
    				pp=p;
    				for(int h=0;h<size;h++)
    					System.out.print(input[h]+" ");
    				System.out.println();
    			}
    			p=0;
            }
        } else {
            for (int i = startindex; i < size; i++) {
                int temp = input[i];
                input[i] = input[startindex];
                input[startindex] = temp;
                Permute(input, startindex + 1,a);
            }
        }
    }

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num[]=new int[n];
		ArrayList a=new ArrayList();
		for(int i=0;i<n;i++){
			num[i]=s.nextInt();
			a.add(num[i]);
		}
		MaxPowerPointsEmperorCapturingCountries.Permute(num,0,a);
		System.out.println(MaxPowerPointsEmperorCapturingCountries.pp);
	}
}
//1 6 2 7 3 8 4 9 5 10