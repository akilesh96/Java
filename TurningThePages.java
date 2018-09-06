import java.util.*;
public class TurningThePages {

    public static void main(String[] args) {
		Scanner s=new Scanner( System.in);
	    int n=s.nextInt(),p=s.nextInt();
	    int front=0,back=0;
	    if(n%2==1)
	    n--;
	    if(p%2==1)
	    	p--;
	    if(p!=1)
	    front=(int)Math.floor(p/2);
	    if((n-p)!=1)
	    back=(int)Math.floor((n-p)/2);
	    System.out.println(Math.min(front,back));
	}
}