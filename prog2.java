import java.util.Scanner;
class prog2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n1,n2;
System.out.println("enter 2 no");
n1=s.nextInt();
n2=s.nextInt();
if(n1%n2==0)
System.out.println("n1 is multiple of n2");
else
System.out.print("n1 is not the multiple of n2");
}
}