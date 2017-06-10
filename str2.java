import java.util.*;
class str2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
char[] c=s1.toCharArray();
for(int j=0;j<s1.length();j++)
{
if(c[j]!=c[j+1])
System.out.println(c[j]);
}
}
}
