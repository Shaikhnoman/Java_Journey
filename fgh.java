import java.util.Scanner;
class data
{
int a,b;
Scanner s=new Scanner(System.in);
void get()
{

System.out.print("enter no");
a=s.nextInt();
b=s.nextInt();
}
}
class sum extends data
{
void put()
{
int c=a+b;
System.out.print("sum="+c);
}
}
class fgh
{
public static void main(String args[])
{
sum x=new sum();
x.get();
x.put();
}
}

