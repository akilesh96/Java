import java.util.*;
public class CommonAlphabets {

    public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n;
		n=s.nextInt();
	 String m[]=new String[n];
	 char sb[]=new char[100];
	 int c=0;
	 for(int i=0;i<n;i++)
	 {
	     m[i]=s.next();
	 }
	 for(int i=0;i<n;i++)
	 {
		 //int count=0;
		 for(int j=0;j<m[i].length();j++)
	     {
			 int count=0;
			 char a=m[i].charAt(j);
	         for(int k=0;k<n;k++)
	         {
	             if(i==k)
	             continue;
	             for(int l=0;l<m[k].length();l++)
	             {
	                 char b=m[k].charAt(l);
	                 if(a==b)
	                 {
	                	 count++;
	                	 break;
	                 }
	             }
	         }
	         if(count+1==n)
	    	 {
	    	 sb[c]=a;
	    	 c++;
	    	 }
	     }
	     
	 }
	 //Arrays.sort(sb);
	 for(int i=0;i<c;i++)
	 {
		 for(int j=0;j<c;j++)
		 {
			 if(i==j)
				 continue;
			 if(sb[i]<sb[j])
				 {
				 char temp=sb[i];
				 sb[i]=sb[j];
				 sb[j]=temp;
				 }
		 }
	 }
	 if(c==0)
		 System.out.println("-1");
	 else
	 {
		int count=0;
	 for(int i=0;i<c;i++)
	 {
		 char v=sb[i];
		 System.out.print(v);
		 count=0;
		 for(int j=i+1;j<c;j++)
		 {
			 if(v==sb[j])
				 count++;
		 }
		 i=i+count;
	 }
	 }

	}
}