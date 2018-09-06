import java.util.*;
import java.util.Scanner;

public class PeanutsCounting
{
    public static int max=0;
    public static void print(int[] p, int n,int[] num) 
    {
        int temp=0;
        for (int i = 0; i < n; i++)
        {
            temp+=num[p[i]-1];
        }
        if(max<temp)
        max=temp;
    }
 
    public static void generateUniquePartition(int n,int[] num) 
    {
        int[] p = new int[n];
        int k = 0, count = 0;
        p[k] = n;
        while (true) 
        {
            count++;
            print(p, k + 1,num);
            int rem_value = 0;
            while (k >= 0 && p[k] == 1) 
            {
                rem_value += p[k];
                k--;
            }
            if (k < 0)
                return;
 
            p[k]--;
            rem_value++;
 
            while (rem_value > p[k]) 
            {
                p[k + 1] = p[k];
                rem_value -= p[k];
                k++;
            }
            p[k + 1] = rem_value;
            k++;
        }
    }
 
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),num[]=new int[n];
        for(int i=0;i<n;i++)
        num[i]=sc.nextInt();
        generateUniquePartition(n,num);
        System.out.println(PeanutsCounting.max);
    }
}
//or
/*
import java.util.*;
public class Partition { 

    public static void partition(int n) {
        partition(n, n, "");
    }
    public static void partition(int n, int max, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i, prefix + " " + i);
        }
    }


    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        partition(N);
    }

}
*/