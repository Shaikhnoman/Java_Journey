import java.util.Scanner;
class add
{
int a,b,sum=0;
void get()
{
Scanner s=new Scanner(System.in);
System.out.print("enter 2 no");
a=s.nextInt();
b=s.nextInt();
sum+=a+b;
}
void put()
{
System.out.print("sum="+sum);
}
}
class xyzm
{
public static void main(String args[])
{
add x=new add();
x.get();
x.put();
}
}