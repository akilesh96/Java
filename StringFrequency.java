import java.util.*;
public class StringFrequency {
public static void main(String[] args) {
//Your Code Here
Scanner sc= new Scanner(System.in);
String s=sc.next();
Set<Character> set= new HashSet<Character>();
for ( int i= 0 ;i<s.length();i++)
set.add(s.charAt(i));
int c[]= new int [ 58 ];
int max= 0 ;
for ( int i= 0 ;i<s.length();i++)
if (set.contains(s.charAt(i))){
c[s.charAt(i)- 65 ]++;
if (max<c[s.charAt(i)- 65 ])
max=c[s.charAt(i)- 65 ];
}
while (max!= 0 ){
for ( int i= 0 ;i< 58 ;i++){
if (c[i]==max)
System.out.println(( char )( 65 +i)+ "" +c[i]);
}
max--;
}
System.out.println(( char )( 122));
}
}