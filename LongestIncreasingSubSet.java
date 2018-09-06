import java.util.*;
public class LongestIncreasingSubSet {

    public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int[]num=new int[n];
	 for(int i=0;i<n;i++)
	 num[i]=s.nextInt();
	 int max=0,c=1;
	 for(int i=n-1;i>=1;i--){
	     if(num[i]<num[i-1])
	     c++;
	     else{
	         if(max<c)
	         max=c;
	         c=1;
	     }
	     if(i==1){
	    	 if(max<c)
		         max=c;
	     }
	 }
	 //System.out.println("Max:"+max);
	 int f=0;
	 c=1;
	 for(int i=n-1;i>0;i--){
	     if(num[i]<num[i-1]){
	         c++;
	         //System.out.println(c);
	     }
	     else{
	         if(max==c)
	         f=1;
	         c=1;
	     }
	     if(max==c||f==1){
	    	 //System.out.println("hi");
	         for(int j=max-2;j>=0;j--)
	         System.out.print(num[i+j]+" ");
	         System.out.println(num[i-1]);
	         break;
	     }
	 }
	// System.out.println(max);

	}
}