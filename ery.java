import java.util.Scanner;
class a
{
int x;
void show1()
{
x=4;
}
}
class b extends a
{
void show()
{
int x=20;
int y;
y=x+super.x;
System.out.print("sum="+y);
}
}
class ery
{
public static void main(String args[])
{
b z=new b();
z.show();
}
}