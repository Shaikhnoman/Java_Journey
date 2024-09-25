import java.util.Scanner;
class a
{
int x=6;
void show1()
{
System.out.print("x="+x);
}
}
class b extends a
{
int y=15;
void show()
{
System.out.print("y="+y);
}
}
class ert
{
public static void main(String args[])
{
b z=new b();
z.show();
z.show1();
}
}