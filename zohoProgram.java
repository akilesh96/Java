import java.util.Scanner;

public class zohoProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		while(str.length()!=1){
			int sum=0;
			String copy=str;
			str=null;
			for(int i=0;i<copy.length();i++){
				sum+=(copy.charAt(i)-'0');
			}
			str=""+sum;
		}
		System.out.println(str);

	}

}
