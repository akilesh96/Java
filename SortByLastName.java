import java.util.*;
public class SortByLastName {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt()+1;
        String name[]=new String[n];
        for(int i=0;i<n;i++)
        name[i]=s.nextLine();
        for(int i=1;i<n;i++)
        {
            String sp[]=name[i].split("\\s+");
            StringBuilder sb=new StringBuilder();
            sb.append(sp[1]);
            sb.append(" ");
            sb.append(sp[0]);
            name[i]=sb.toString();
        }
        Arrays.sort(name);
        for(int i=1;i<n;i++)
        {
            String sp[]=name[i].split("\\s+");
            System.out.println(sp[1]+" "+sp[0]);
        }
	}
}