import java.util.LinkedHashSet;
import java.util.Scanner;

public class zohoProgram2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine().toLowerCase();
		String[]sp=str.split("\\s+");
		StringBuilder sb=new StringBuilder();
		LinkedHashSet<Character> l=new LinkedHashSet<>();
		for(int i=0;i<sp.length;i++){
			sb.append(sp[i]);
			for(int j=0;j<sp[i].length();j++){
				l.add(sp[i].charAt(j));
			}
		}
		str=sb.toString();
		int num[]=new int[58];
		for(int i=0;i<sb.length();i++){
			if(l.contains(str.charAt(i))){
				num[str.charAt(i)-65]++;
			}
		}
		String s1="",s2="",mid="";
		int flag=0;
		for(int i=0;i<58;i++){
			char cur=(char)(i+65);
			if(num[i]%2==0&&num[i]>=2){
				for(int j=0;j<num[i]/2;j++){
					s1+=cur;
					s2+=cur;
				}
			}
			else if(num[i]%2==1&&num[i]>1){
				for(int j=0;j<(num[i]-1)/2;j++){
					s1+=cur;
					s2+=cur;
				}
			}else if(num[i]==1&&flag==0){
				mid+=cur;
				flag=1;
			}	
		}
		sb.delete(0,sb.length());
		sb.append(s2);
		s2=sb.reverse().toString();
		int len=s1.length()*2+1;
		System.out.println(len);
		System.out.println(s1+""+mid+""+s2);
	}

}
