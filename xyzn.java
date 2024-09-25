import java.util.Scanner;
class emp
{
String name,post;
int age,sal;
void get()
{
Scanner s=new Scanner(System.in);
System.out.print("enter name,age,post,sal");
name=s.nextLine();
post=s.nextLine();
age=s.nextInt();
sal=s.nextInt();

}
void put()
{
System.out.print("name="+name+"post="+post+"age="+age+"sal="+sal);
}
}
class xyzn
{
public static void main(String args[])
{
emp x=new emp();
x.get();
x.put();
}
}