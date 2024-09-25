import java.util.Scanner;
class stringhighest
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1,s2;
System.out.print("enter 2 string");
s1=s.nextLine();
s2=s.nextLine();
int d=s1.compareTo(s2);
if(d>0)
{
System.out.print("s1 highest");
}
else if(d<0)
{
System.out.print("s2 highest");
}
else
{
System.out.print("both are equal");
}

}
}