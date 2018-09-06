import java.util.*;
public class IsolateInterlacedStrings {
static StringBuilder sb;
static void display(){
    for(int i=0;i<sb.length();i++){
        if(sb.charAt(i)!='#')
        System.out.print(sb.charAt(i));
    }
    System.out.println();
}
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next(),s2="";
		int l1=s.nextInt();
		int l2=str.length()-l1,f=0;
		sb=new StringBuilder(str);
		if(l2>=l1){
		    f=1;
		for(int i=0,j=0;j<l1;j++,i+=2){
		    sb.deleteCharAt(i);
		    sb.insert(i,'#');
		    System.out.print(str.charAt(i));
		}
		}
		else{
		    f=0;
		    for(int i=1,j=0;j<l2;j++,i+=2){
		        s2+=str.charAt(i);
		        sb.deleteCharAt(i);
		        sb.insert(i,'#');
		    }
		}
		if(f==1)
		display();
		else{
		    display();
		    System.out.print(s2);
		}
	}
}