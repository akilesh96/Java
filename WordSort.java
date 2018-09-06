import java.util.Scanner;

public class WordSort {

	public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
        String names[] = new String[n],temp;
        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.next();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
            	System.out.println(names[i].compareTo(names[j]));
            	if (names[i].compareTo(names[j])>0) 
                {
                    System.out.println(names[i]+" "+names[j]);
            		temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
		// TODO Auto-generated method stub

	}

}
