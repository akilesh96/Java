import java.util.*;
public class Apple {

    public static void main(String[] args) {
 Scanner s=new Scanner (System.in);
 int n=s.nextInt();
 int apples=s.nextInt();
 String box[]=new String[n];
 for(int i=0;i <n;i++)
 {
 box[i]=s.next();
 }
 int count=0;
 StringBuilder sb=new StringBuilder();
 for(int i=0;i<n;i++)
 {
     String check=box[i];
     String str=sb.toString();
     if(!str.contains(check))
     {
         sb.append(check);
         int num=Integer.parseInt(check);
         if(num==apples)
         count++;
     }
 }
 for(int i=0;i<n;i++)
 {
     if(box[i]=="#")
     continue;
     int num1=Integer.parseInt(box[i]);
     for(int j=0;j<n;j++)
     {
         if(box[j]=="#" || i==j)
         continue;
         int num2=Integer.parseInt(box[j]);
         if(num1+num2==apples)
         {
             count++;
             for(int k=0;k<n;k++)
             {
                 String str1=Integer.toString(num1),str2=Integer.toString(num2);
            	 if(str1.equals(box[k]))
                 box[k]="#";
                 if(str2.equals(box[k]))
                 box[k]="#";
             }
             break;
         }
     }
 }
System.out.println(count);
	}
}