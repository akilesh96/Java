import java.util.Scanner;

public class ExactCapacityBooking {
	public static int count=0;
    public static void partition(int n, int max) {
        if (n == 0) {
            count++;
            return;
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i);
        }
    }


    public static void main(String[] args) { 
        Scanner s=new Scanner(System.in);
        partition(s.nextInt(),s.nextInt());
        System.out.println(ExactCapacityBooking.count);
    }

}
