import java.util.Scanner;
class stringequal
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1,s2;
System.out.print("enter 2 string");
s1=s.nextLine();
s2=s.nextLine();
boolean x=s1.equals(s2);
if(x)
{
System.out.print("both are equal");
}
else
{
System.out.print("not equal");
}

}
}