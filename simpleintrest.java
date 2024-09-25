import java.util.Scanner;
class simpleintrest
{
public static void main(String agrs[])
{
Scanner S=new Scanner(System.in);
float p,n,r,si;
System.out.print("enter p,n,r");
p=S.nextFloat();
n=S.nextFloat();
r=S.nextFloat();
si=p*n*r/100;
System.out.print("simpe="+si);
}
}
